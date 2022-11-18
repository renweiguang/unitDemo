package threadDeomo;

public class ThreadTest {
    /**
     * @param args
     */
    public static void main(String[] args) {

        class MyThread extends Thread {
            public MyThread(String name) {
                super(name);
            }

            @Override
            public void run() {
                synchronized (this) {
                    for (int i = 0; i < 10; i++) {
                        try {
                            Thread.sleep(100);
                            System.out.println(Thread.currentThread().getName() + " loop " + i);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        Thread t1 = new MyThread("t1");
        Thread t2 = new MyThread("t2");
        t1.start();
        t2.start();
    }
}
