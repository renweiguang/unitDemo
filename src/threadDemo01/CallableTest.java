package threadDemo01;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable<Integer> {

    // 重写执行体call()
    @Override
    public Integer call() throws Exception {

        int i = 0;
        for (; i < 10; i++) {
            // 当前线程
            System.out.println("当前线程是：：：" + Thread.currentThread()
                    + ":" + i);
        }
        return i;
    }

    public static void main(String[] args) {

        // 创建callable对象
        CallableTest call = new CallableTest();
        FutureTask<Integer> fu = new FutureTask<Integer>(call);
        Thread th = new Thread(fu, "我是fu线程");

        for (int i = 0; i < 3; i++) {
            // 当前线程
            System.out.println(Thread.currentThread().getName() + "当前线程");
            if (i == 0) {
                th.start();
            }
        }

        // 得到返回值
        try {
            System.out.println("返回值是:" + fu.get());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
