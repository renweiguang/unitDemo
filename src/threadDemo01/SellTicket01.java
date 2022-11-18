package threadDemo01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket01 extends Thread {
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    // lock 需要释放锁
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在售卖第:" + tickets + "张");
                    tickets--;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
