/**
 * @author rwg
 * @date 2021/11/23 15:53
 */
public class ThreadLocalTest {

    static class MyThread extends Thread {
        //多条线程同时操作一个threadLocal，不会发生冲突，表示threadlocal为每条线程都创建了副本，不对真实threadLocal做改变
        private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 10; i++) {
                threadLocal.set(i);
                System.out.println(getName() + " threadLocal.get() = " + threadLocal.get());
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThreadA = new MyThread();
        myThreadA.setName("ThreadA");

        MyThread myThreadB = new MyThread();
        myThreadB.setName("ThreadB");

        myThreadA.start();
        myThreadB.start();
    }
}
