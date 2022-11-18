//package waitNotifyDemo;
//
//public class App
//{
//
//    public static void main(String[] args)
//    {
//        // 共享资源
//        Movie m = new Movie();
//
//        Player p = new Player(m);
//        Watcher w = new Watcher(m);
//
//        Thread t1 = new Thread(p);
//        Thread t2 = new Thread(w);
//
//        t1.start();
//        t2.start();
//    }
//}
