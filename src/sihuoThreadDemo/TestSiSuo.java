package sihuoThreadDemo;

/**
 * 发生死锁的条件：嵌套锁（就是拥有了锁1 又要获得锁2  就是锁1包含锁2的情况）  而且所得顺序不一样
 */
public class TestSiSuo {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "锁住了lock1");
                    synchronized (lock2) {
                        System.out.println(Thread.currentThread().getName() + "锁住了lock2");
                    }
                }
            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "锁住了lock2");
                    synchronized (lock1) {
                        System.out.println(Thread.currentThread().getName() + "锁住了lock1");
                    }
                }
            }
        }, "t2");

        t1.start();
        t2.start();

    }
}
