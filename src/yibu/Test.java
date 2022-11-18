package yibu;

public class Test {
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        test.test0();
    }

    public void test0() throws Exception {
        System.out.println("main函数开始执行");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("===task start===");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("===task finish===");
            }
        });

        thread.start();
        System.out.println("main函数执行结束");
    }
}
