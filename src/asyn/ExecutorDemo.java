package asyn;

import lombok.SneakyThrows;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    Set<Integer> ids = new HashSet<>();
    //表示线程开启的数量
    private ExecutorService executor = Executors.newFixedThreadPool(3);

    //表示有几个任务就开启几个：CountDownLatch:具有计数器的功能，
    // 等待其他线程执行完毕，主线程在继续执行，用于监听某些初始化操作，
    // 并且线程进行阻塞，等初始化执行完毕后，通知主线程继续工作执行
    final CountDownLatch latch = new CountDownLatch(3);

    public void asynTask() throws InterruptedException {
        ids.add(1);
        ids.add(2);
        ids.add(3);

        for (int i = 0; i < ids.size(); i++) {
            executor.execute(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);//方便观察结果
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    latch.countDown();
                }
            });
        }
        System.out.println("子线程执行了");
        ////阻塞当前线程，直到计数器的值为0
        latch.await();// 保证所有子线程都运行完成去召唤主线程
        System.out.println("下面开始执行主线程");
    }
}