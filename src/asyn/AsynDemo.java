package asyn;

/***
 * 相当于异步操作，开启一条线程去睡5s，但是主线程还在执行，相当于异步
 */
public class AsynDemo {
    public static void main(String[] args) {
        System.out.println("main函数开始执行");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("===task start===");
                try {
                    Thread.sleep(2000);
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
