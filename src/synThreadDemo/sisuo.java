package synThreadDemo;

public class sisuo {
    public static void main(String[] args) {
        Object product = new Object();
        Object money = new Object();
        Test1 test1 = new Test1(product, money);
        Test2 test2 = new Test2(product, money);
        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);
        t1.start();
        t2.start();
    }

    static class Test1 implements Runnable {
        Object product;
        Object money;

        public Test1(Object product, Object money) {
            this.money = money;
            this.product = product;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    test();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void test() throws InterruptedException {
            synchronized (product) {
                Thread.sleep(100);
                synchronized (money) {
                }
            }
            System.out.println("一手交货一手交钱");
        }
    }

    static class Test2 implements Runnable {
        Object product;
        Object money;

        public Test2(Object product, Object money) {
            this.money = money;
            this.product = product;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    test1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void test1() throws InterruptedException {
            synchronized (money) {
                Thread.sleep(100);
                synchronized (product) {
                }
            }
            System.out.println("一手交钱一手交货");
        }
    }
}
