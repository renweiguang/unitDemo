package submitTest;

import java.util.concurrent.*;

/**
 * @author renwg
 * @date 2022/11/16
 */
public class SubmitTest1 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);//创建一个可容纳40个线程的线程池
        for (int i = 0; i < 40; i++) {
            Future<String> future = pool.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                return "1";
            });
            try {
                System.out.println(future.get(200000, TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                future.cancel(true);
            } catch (ExecutionException e) {
                future.cancel(true);
            } catch (TimeoutException e) {
                future.cancel(true);
            }
        }
    }
}
