package threadDeomo;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorService {
    private static final java.util.concurrent.ExecutorService EXECUTOR_SERVICE = Executors.newCachedThreadPool();

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("thread1 start");
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(500);
                        System.out.println("thread1 is working");
                    }
                    System.out.println("thread1 end");
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("thread2 start");
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(500);
                        System.out.println("thread2 is working");
                    }
                    System.out.println("thread2 end");
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (EXECUTOR_SERVICE.awaitTermination(10, TimeUnit.SECONDS)) {
                        System.out.println("thread3 start");
                        System.out.println("thread3 end");
                    }
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            }
        });
        try {
            EXECUTOR_SERVICE.execute(thread1);
            EXECUTOR_SERVICE.execute(thread2);
            EXECUTOR_SERVICE.shutdown();
            thread3.start();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
