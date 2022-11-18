package synThreadDemo;

/**
 * 模拟死锁，死锁就是我锁住了货，还要在锁住了货的同时去要钱，形成包含关系， 嵌套锁。  然后两个线程锁和货的顺序还不一致
 * Java中死锁最简单的情况是，一个线程T1持有锁L1并且申请获得锁L2，而另一个线程T2持有锁L2并且申请获得锁L1，
 * 因为默认的锁申请操作都是阻塞的，所以线程T1和T2永远被阻塞了。导致了死锁。
 * 这是最容易理解也是最简单的死锁的形式。但是实际环境中的死锁往往比这个复杂的多。
 * 可能会有多个线程形成了一个死锁的环路，比如：线程T1持有锁L1并且申请获得锁L2，而线程T2持有锁L2并且申请获得锁L3，
 * 而线程T3持有锁L3并且申请获得锁L1，这样导致了一个锁依赖的环路：T1依赖T2的锁L2，T2依赖T3的锁L3，而T3依赖T1的锁L1。从而导致了死锁。
 * <p>
 * 从这两个例子，我们可以得出结论，
 * 产生死锁可能性的最根本原因是：线程在获得一个锁L1的情况下再去申请另外一个锁L2，也就是锁L1想要包含了锁L2，
 * 也就是说在获得了锁L1，并且没有释放锁L1的情况下，又去申请获得锁L2，这个是产生死锁的最根本原因。另一个原因是默认的锁申请操作是阻塞的。
 */
public class SynDemo {
    public static void main(String[] args) {
        // 死锁就是一份资源多个线程共享 而且这份资源被锁定了

        Object money = new Object();
        Object pruduct = new Object();

        Test t1 = new Test(money, pruduct);

        Test1 t2 = new Test1(money, pruduct);

        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t2);

        t3.start();
        t4.start();

    }

    static class Test implements Runnable {
        Object money;
        Object product;

        public Test(Object money, Object product) {
            this.money = money;
            this.product = product;
        }

        @Override
        public void run() {
            // 死循环
            while (true) {
                test();
            }
        }

        public void test() {
            // 嵌套锁
            synchronized (money) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (product) {

                }
            }
            System.out.println("一手给钱");
        }
    }

    static class Test1 implements Runnable {
        Object money;
        Object product;

        public Test1(Object money, Object product) {
            this.money = money;
            this.product = product;
        }

        @Override
        public void run() {
            // 死循环
            while (true) {
                test();
            }
        }

        public void test() {
            synchronized (product) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (money) {
                }
            }
            System.out.println("一手给货");

        }
    }
}
