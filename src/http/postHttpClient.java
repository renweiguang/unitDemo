package http;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class postHttpClient {
    public static void main(String[] args) {
        HttpGet loginGet = new HttpGet("http://localhost:8084/user/login");

        String value = "[{\n"
                + "\"name\":\"rwgggggggggggggg\",\n"
                + "\"pwd\":\"8763\"\n"
                + "},{\n"
                + "\"name\":\"333ddqd\",\n"
                + "\"pwd\":\"36145\"\n"
                + "}\n"
                + "]";

        //创建post请求对象
        HttpPost post = new HttpPost("http://localhost:8084/user/addJsonListStringUser");
        try {
            //把参数放入请求对象，，post发送的参数list，指定格式
            post.setEntity(new StringEntity(value));
            CloseableHttpClient client = HttpClients.createDefault();
            client.execute(loginGet);
            //启动执行请求，并获得返回值
            CloseableHttpResponse response = client.execute(post);

            if (response.getStatusLine().getStatusCode() == 200) {
                //得到返回的entity对象
                HttpEntity entity = response.getEntity();
                //把实体对象转换为string
                String result = EntityUtils.toString(entity, "UTF-8");
                //返回内容
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
