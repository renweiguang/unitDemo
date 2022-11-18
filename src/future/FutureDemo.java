package future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 另外一种情况是，如果你需要并发去查询一些东西（比如爬虫），并发查询只要有一个结果返回，你就认为查询到了，并且结束查询，
 * 这时也需要用CompletionService和Future来解决。
 */

/**
 * future并发编程，比如有这么个需求，我们要用线程池去执行某些任务，当其中一个任务执行完毕便可以停止，如果是传统的线程必须等到任务全部执行完才能知道
 * 因为程序不能中断，但是引入Futrue可以监视目标线程调用call的情况，当你调用Future的get()方法以获得结果时，当前线程就开始阻塞，直接call方法结束返回结果
 */

public class FutureDemo {
    private static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            // 模拟真实事务的处理过程，这个过程是非常耗时的。
            Thread.sleep(5000);
            return "call return " + Thread.currentThread().getName();
        }
    }

    public static void main(String[] args) throws Exception {
        FutureDemo demo = new FutureDemo();
        //        demo.testComplete();
        demo.testFutrue();
    }

    private void testFutrue() throws Exception {
        List<Future<String>> futures = new ArrayList<Future<String>>();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("已经提交资源申请");
        for (int i = 0; i < 10; i++) {
            futures.add(executorService.submit(new Task()));
        }
        for (Future<String> future : futures) {
            if (!future.isDone()) {
                System.out.println("资源还没有准备好");
            }
            //执行到这开始阻塞，等拿到了结果开始输出第一个future然后继续for循环
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}

