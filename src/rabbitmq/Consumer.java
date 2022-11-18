package rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

public class Consumer
{
    // 队列名称
    private final static String QUEUE_NAME = "Jacky";

    public static void main(String[] argv) throws Exception
    {
        // 创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        // 设置RabbitMQ主机
        factory.setHost("localhost");
        // factory.setVirtualHost("/");
        // factory.setUsername("admin");
        // factory.setPassword("admin");
        // 获取连接
        Connection connection = factory.newConnection();
        // 获取信道
        Channel channel = connection.createChannel();

        // 声明要关注的队列
        channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        // 创建消费者
        QueueingConsumer consumer = new QueueingConsumer(channel);
        // 获取消息
        channel.basicConsume(QUEUE_NAME, true, consumer);
        while (true)
        {
            // 消费者接收消息
            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
            // 获取消息正文
            String message = new String(delivery.getBody());
            System.out.println(" [x] Received '" + message + "'");
        }
    }
}
