package threadDemo01;

import java.util.concurrent.*;

public class NewFixedThreadPoolTest {

    /**
     * get方法是阻塞的，他会一条线程 一条线程的get 所以虽然前面是多线程执行，但是get的时候 变成单线程阻塞了。
     * 建议 使用 countdownlatch， 如果不需要返回结果，直接excute
     */


    /**
     * 线程池， 每两秒打印三个说明三条线程同时执行代码块。
     *
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService theadPoll = Executors.newFixedThreadPool(3);
        //countLatch的数目应该保持和执行的任务数是一致的，没完成一个任务countDownLatch数量减一
        for (int i = 0; i < 10; i++) {
            try {
                theadPoll.submit(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-------------------->執行了");
                }).get(2500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }

        System.out.println("全部执行结束");
        theadPoll.shutdown();
    }
}
