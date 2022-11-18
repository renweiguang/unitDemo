package rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer {

    // 队列名称
    private final static String QUEUE_NAME = "Jacky";

    public static void main(String[] args) throws IOException, TimeoutException {
        // 创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        // 设置RabbitMQ主机
        factory.setHost("localhost");
        // factory.setUsername("admin");
        // factory.setPassword("admin");
        // factory.setVirtualHost("/");

        // 创建连接
        Connection connection = factory.newConnection();
        // 创建信道
        Channel channel = connection.createChannel();
        // 声明一个队列：
        channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        // 要发送的信息
        String message = "Hello RabbitMQ!";
        // 发送消息到队列中
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");
        // 关闭信道
        channel.close();
        // 关闭连接
        connection.close();
    }
}