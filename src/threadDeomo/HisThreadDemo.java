package threadDeomo;

import java.util.concurrent.CountDownLatch;

public class HisThreadDemo {

    private static final CountDownLatch latch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {

        HisThread h2 = new HisThread(latch);
        HisThread h3 = new HisThread(latch);

        h2.setName("关羽");
        h3.setName("张飞");
        h2.start();
        h3.start();

        latch.await();

        Thread.currentThread().setName("刘备");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
