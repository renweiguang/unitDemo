package threadDeomo;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * 接口测试，利用多线程复刻高并发场景，同一秒内，请求同一接口，只有一个请求能通过。
 */
public class TestGaoBingFa {
    /**
     * @param args
     */
    public static void main(String[] args) {

        class MyThread extends Thread {
            public MyThread(String name) {
                super(name);
            }

            @Override
            public void run() {
                String value = "{\n" +
                        "    \"OperatorID\":\"101437000\",\n" +
                        "    \"Data\":\"BSRlZL6b5JSYC1pPPMI/LwzZF/hmI672HSXPDLZP8UpnOUy4f3rE5C3ejTvmdWfmB2ed3XTz1xAf74hHZN6ygjGUEFgns8pZl5tBvWOzqazdusaM8f9/Rs4rj0cTAJxpkBXBMwcjb2Yj+F+SNK5Tyk6SnSaznRTNEupbBYPoySh9+tMe4asa4NuzCXE7i++dEwxSlZQ104/9sz2kM8cfuDNw73UA8L43Zu9RKPZDNEzP853Gu/7D+P+XFLaDTzPqiiCcQVHNeOKiE05b4WA9fSbzsjMNDJWssV7KPl1P7ttChiyQ/zUmQIeN8iY/s3Oa4jXx18iO7DtGBbhyBe5/fn7i8c+tl0flMz/1RFj6V7OT/JOGh6WJ0StNwPD0txrEa+U06yuPL99ykQR45HzIT8xUvvUXyhwRqEwr+sx1cSihigB0bIayVEY3BgI+U2Dhx8mi72HG9ULrJTluVaRshIM0eOfgL4gyOWYQT9mqDzg=\",\n" +
                        "    \"TimeStamp\":\"20180517171155\",\n" +
                        "    \"Seq\":\"0001\",\n" +
                        "    \"sig\":\"F02EB90C18707E86E2DCF06EEDDA8DDA\"\n" +
                        "}";

                //创建post请求对象
                HttpPost post = new HttpPost("http://127.0.0.1:8030/evcs/v1/notification_charge_order_info");
                try {
                    post.setHeader("content-type", "application/json");
                    //把参数放入请求对象，，post发送的参数list，指定格式
                    post.setEntity(new StringEntity(value));
                    CloseableHttpClient client = HttpClients.createDefault();
                    //启动执行请求，并获得返回值
                    CloseableHttpResponse response = client.execute(post);
                    //得到返回的entity对象
                    HttpEntity entity = response.getEntity();
                    //把实体对象转换为string
                    String result = EntityUtils.toString(entity, "UTF-8");
                    //返回内容
                    System.out.println(result);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }

        Thread t1 = new MyThread("t1");
        Thread t2 = new MyThread("t2");
        Thread t3 = new MyThread("t2");
        Thread t5 = new MyThread("t2");
        Thread t6 = new MyThread("t2");
        Thread t7 = new MyThread("t2");

        t1.start();
        t2.start();
        t3.start();
        t5.start();
        t6.start();
        t7.start();

    }
}
