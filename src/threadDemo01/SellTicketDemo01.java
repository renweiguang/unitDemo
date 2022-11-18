package threadDemo01;

public class SellTicketDemo01
{

    public static void main(String[] args) throws InterruptedException
    {

        SellTicket01 sellTicket01 = new SellTicket01();

        Thread t1 = new Thread(sellTicket01, "詹姆斯");
        Thread t2 = new Thread(sellTicket01, "韦德");
        Thread t3 = new Thread(sellTicket01, "安东尼");

        t1.start();
        // t1.join();
        t2.start();
        t3.start();

    }
}
