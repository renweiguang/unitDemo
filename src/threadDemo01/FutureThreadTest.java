package threadDemo01;

import java.util.concurrent.FutureTask;

public class FutureThreadTest {

    public static void main(String[] args) {
        // 先使用Lambda表达式创建Callable<Integer>对象，
        // 并使用FutureTask来包装Callable对象
        FutureTask<Integer> task = new FutureTask<Integer>(() ->
        {
            // 这里相当于call方法执行体。
            int i = 0;
            for (i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName() + "=====" + i);
            }
            return i;
        });

        // 阻塞住了。。。。。
        try {
            System.out.println("子线程的返回值" + task.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 创建一个线程，并start启动它。
        for (int i = 0; i < 100000; i++) {
            System.out.println(Thread.currentThread().getName() + "=======" + i);
            if (i == 0) {
                Thread t1 = new Thread(task, "我是fu线程");
                t1.start();
            }
        }


    }

}
