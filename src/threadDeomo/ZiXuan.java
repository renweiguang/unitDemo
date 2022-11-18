package threadDeomo;

public class ZiXuan {
    private static volatile int count = 2;

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
                    count--;
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
                    count--;
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (count <= 0) {
                            System.out.println("thread3 start");
                            System.out.println("thread3 end");
                            return;
                        }
                    }
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            }
        });
        try {
            thread1.start();
            thread2.start();
            thread3.start();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
