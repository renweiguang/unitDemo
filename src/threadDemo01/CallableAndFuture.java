package threadDemo01;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * callable用于产生结果，Future用于拿到产生的结果。
 */
public class CallableAndFuture {
    public static void main(String[] args) {
        // 因为线程体就在下面，所以直接这么写。
        Callable<Integer> callable = new Callable<Integer>() {
            public Integer call() throws Exception {
                Thread.sleep(5000);
                return new Random().nextInt(5);
            }
        };

        FutureTask<Integer> future = new FutureTask<>(callable);
        new Thread(future).start();
        try {
            System.out.println("开始阻塞了...");
            System.out.println(future.get());
            System.out.println("刚执行到我...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
