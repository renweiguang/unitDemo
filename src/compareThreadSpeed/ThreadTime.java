package compareThreadSpeed;

public class ThreadTime {
    public static void main(String[] arg) {
        ThreadTest tt = new ThreadTest();
        tt.start();
    }
}

class ThreadTest extends Thread {
    public void run() {
        long begin = System.currentTimeMillis();// 取开始bai时间du 单位是zhi毫秒
        for (int i = 0; i < 10000; i++) {
            System.out.println("线程运行中...");
        }
        long end = System.currentTimeMillis();// 取结束时间
        System.out.println("一共运行了" + (end - begin) + "毫秒");
    }
}