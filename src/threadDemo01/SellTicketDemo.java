package threadDemo01;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket s = new SellTicket();

        Thread t1 = new Thread(s, "窗口一");
        Thread t2 = new Thread(s, "窗口二");
        Thread t3 = new Thread(s, "窗口三");

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程窗口：" + i);
        }
    }

}
