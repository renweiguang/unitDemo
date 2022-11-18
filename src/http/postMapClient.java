package http;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author rwg
 * @date 2021/10/15 17:17
 */
public class postMapClient {
    public static void main(String[] args) {
        Map<String,String> parms = new HashMap();
        parms.put("sig","QmsBM703eF6FUCBi+1EVNykLWSRvpeEqqov97KxCLAri7isEePEGrrHuw7+UroD+XeibRSPou\n" +
                "z5hYkNmhLpniiUk/KwOarQPTxSj1eE3ClISl7QolceSPVf9zXw0qUZmD4Yx2ygS26sB6GxxBCTgnrY\n" +
                "X3slmMqDAQtG3pU3LJXE=");
        parms.put("pageNo","1");
        parms.put("pageSize","10");
        parms.put("platformCode","BLLC9M3Q2");
        parms.put("seq","1559817133443");
        parms.put("timestamp","1559817133443");
        System.out.println(parms);

        HttpPost httpPost = new HttpPost("http://127.0.0.1:8084/ali/loginByToken2");
        ArrayList<BasicNameValuePair> list = new ArrayList<>();
        parms.forEach((key, value) -> list.add(new BasicNameValuePair(key, value)));
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            if (Objects.nonNull(parms) && parms.size() >0) {
                httpPost.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            }
            InputStream content = httpPost.getEntity().getContent();
            InputStreamReader inputStreamReader = new InputStreamReader(content, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String readLine = bufferedReader.readLine();
            String s = URLDecoder.decode(readLine, "UTF-8");
            System.out.println("readLine===================================" + readLine);
            System.out.println("s==========================================" + s);
            HttpResponse response = httpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == 200) {
                //得到返回的entity对象
                HttpEntity entity = response.getEntity();
                //把实体对象转换为string
                String result = EntityUtils.toString(entity, "UTF-8");
                //返回内容
                System.out.println(result);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (Objects.nonNull(httpClient)){
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
