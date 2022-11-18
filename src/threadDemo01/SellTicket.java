package threadDemo01;

public class SellTicket implements Runnable {
    private int ticket = 100;

    // 表示共享一把锁
    private Object obj = new Object();

    @Override
    public void run() {
        // 死循环
        while (true) {
            // 一把锁锁三个线程 同步代码块的方式
            synchronized (obj) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第:" + ticket + "张");
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}
