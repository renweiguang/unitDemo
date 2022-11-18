public class SellTicketDemo {

    public static void main(String[] args) {


    SellTicket st = new SellTicket();


    Thread t1 = new Thread(st,"sss");
    Thread t2 = new Thread(st,"111");
    Thread t3 = new Thread(st,"222");

    t1.start();
    t2.start();
    t3.start();


}
}
