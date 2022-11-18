package threadDeomo;

public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("康熙");
        MyThread myThread2 = new MyThread("四阿哥");
        MyThread myThread3 = new MyThread("八阿哥");

        // //给线程起个名字
        // myThread1.setName("高铁");
        // //给线程起个名字
        // myThread2.setName("飞机");

        // 优先级默认只有 1 5 10 分别代表优先级 优先级是相对的，不是绝对的
        // myThread1.setPriority(5);
        // myThread2.setPriority(10);
        // myThread3.setPriority(1);

        // join康熙先执行，等他执行完毕才执行别的，使当前线程先执行完
        myThread1.start();
        try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread2.start();
        myThread3.start();

    }
}
