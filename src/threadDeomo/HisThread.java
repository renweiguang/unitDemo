package threadDeomo;

import java.util.concurrent.CountDownLatch;

public class HisThread extends Thread {
    private CountDownLatch countDownLatch;

    public HisThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        countDownLatch.countDown();
    }
}
