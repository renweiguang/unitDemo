package yibu;

import org.springframework.scheduling.annotation.Async;

public class YiBuTest {
    public static void main(String[] args) {
        YiBuTest yiBuTest = new YiBuTest();
        System.out.println("main函数开始执行");
        yiBuTest.longtime();
        System.out.println("main函数执行结束");
    }

    @Async
    public void longtime() {
        System.out.println("我在执行一项耗时任务");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("完成");
    }
}
