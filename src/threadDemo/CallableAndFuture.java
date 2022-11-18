package threadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableAndFuture {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(threadPool);
        for (int i = 0; i < 30; i++) {
            final int taskID = i;
            cs.submit(new Callable<Integer>() {
                public Integer call() throws Exception {
                    System.out.println(taskID);
                    Thread.sleep(2000);
                    return taskID;
                }
            });
        }
        threadPool.shutdown();

//        try
//        {
//            System.out.println("执行了");
//            System.out.println(cs.take().get());
//        }
//        catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//        catch (ExecutionException e)
//        {
//            e.printStackTrace();
//        }
    }
}

