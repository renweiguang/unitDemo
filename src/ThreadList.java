import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadList {

    public void main(String[] args) {

        List list = new ArrayList();

        Map map = new HashMap();

        for (int i = 0; i < 1000; i++) {

            list.add("" + i);

        }

        int pcount = Runtime.getRuntime().availableProcessors();

        long start = System.currentTimeMillis();

        for (int i = 0; i < pcount; i++) {

            Thread t = new MyThread1(list, map);

            map.put(t.getId(), Integer.valueOf(i));

            t.start();

            try {

                t.join();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

            // System.out.println(list.get(i));

        }

        System.out.println("----" + (System.currentTimeMillis() - start));

    }
}

class MyThread1 extends Thread {

    private List list;

    private Map map;

    public MyThread1(List list, Map map) {

        this.list = list;

        this.map = map;

    }

    @Override

    public void run() {

        int pcount = Runtime.getRuntime().availableProcessors();

        int i = (int) map.get(Thread.currentThread().getId());

        for (; i < list.size(); i += pcount) {
            System.out.println(list.get(i));

        }

    }

}