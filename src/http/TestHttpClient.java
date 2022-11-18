package http;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TestHttpClient {
    /**
     * 步骤:
     * 1.实例化httpClient工具API
     * 2.定义请求url地址  任意网络地址....
     * 3.定义请求的类型  get/post/put/delete
     * 4.发起请求,获取响应的结果
     * 5.判断响应的状态码信息.  200 404 500 406 400....
     * 6.动态解析返回值执行后续操作.
     */
    @Test
    public void test01() {
        HttpClient httpClient = HttpClients.createDefault();
        String url = "http://localhost:8080/springboot-mybatis/user/queryUserList";
        HttpGet get = new HttpGet(url);
        HttpGet loginGet = new HttpGet("http://localhost:8080/springboot-mybatis/user/login");
        try {
            httpClient.execute(loginGet);
            HttpResponse httpResponse = httpClient.execute(get);
            // 判断状态码是否正确
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                // 表示请求正确
                HttpEntity httpEntity = httpResponse.getEntity(); // 获取服务器的全部响应信息(json/html/xml/xxxx)
                String result = EntityUtils.toString(httpEntity, "UTF-8");

                List<User> userList = JSONObject.parseArray(result, User.class);
                userList.stream().forEach(r -> System.out.println(r));

                // 获取之后可以执行业务处理......
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}