package threadDemo;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 30; i++) {
            final int taskID = i;
            threadPool.execute(new Runnable() {
                @Override
                @SneakyThrows
                public void run() {
                    Thread.sleep(2000);
                    System.out.println(taskID);
                }
            });
        }
        threadPool.shutdown();
    }
}