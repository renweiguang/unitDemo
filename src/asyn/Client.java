package asyn;

import org.junit.Test;

/**
 * 这个例子是利用线程池技术实现，执行顺序为先执行子线程，再执行主线程，控制其顺序的方法为CountDownLatch latch = new CountDownLatch(3);
 * <p>
 * 如果不控制其顺序，线程将异步执行，也就是因为子线程要睡觉，主线程不会等待他执行完再去执行，而是在她睡觉的时候就执行了。也称为异步执行。
 * <p>
 * 往往在大多数程序中，都要用线程池去控制程序的执行顺序，要不然就乱了，比如我现在想测试下子线程运行的时长，那么就要控制住子线程和主线程的顺序，
 * <p>
 * 就是让子线程先执行完了再去用主线程计算时间，如果子线程和主线程同时执行将不能计算其时间。
 * <p>
 * 如果不用线程池去控制，执行的顺序是  task2 end --> task3 end --> main end --> 1515615
 * 因为在子线程睡觉的时候主线程不会等待他结束了再去执行，而是并行。
 * <p>
 * <p>
 * 如果控制了，执行的顺序是 1515615 --> task2 end  --> task3 end  --> main end
 */

/**
 * 利用线程实现异步
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {

        boolean r = task2();

        if (r) {
            task3();
        }

        System.out.println("------------main end-----------");
    }

    static boolean task2() throws InterruptedException {

        ExecutorDemo e = new ExecutorDemo();

        e.asynTask();

        System.out.println("------------task2 end-----------");

        return true;
    }

    static void task3() throws InterruptedException {
        int j = 0;
        while (true) {
            if (j++ > 10000) {
                break;
            }
        }

        System.out.println("------------task3 end-----------");
    }

    @Test
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