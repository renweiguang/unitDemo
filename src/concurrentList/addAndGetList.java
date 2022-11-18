package concurrentList;

import java.util.ArrayList;
import java.util.List;

/**
 * 两条线程同时操作同一个list， 一条线程在遍历，一条线程在add，就会报错，java.util.ConcurrentModificationException
 * 因为你遍历的时候，list的数量变了。
 * <p>
 * <p>
 * 但是如果两条线程都是对list进行遍历，就不会报错。
 * <p>
 * 同时add可能会报错，但几率很小。
 */

public class addAndGetList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("goudan");
        list.add("mafei");
        list.add("lubenwei");

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (String stringList : list) {
                    if (stringList.equals("wangwu")) {
                        System.out.println(stringList);
                    }
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                list.add("sdas");
                list.add("1");
                list.add("2");
            }
        };

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                for (String stringList : list) {
                    if (stringList.equals("mafei")) {
                        System.out.println(stringList);
                    }
                }
            }
        };


        Thread thread4 = new Thread() {
            @Override
            public void run() {
                {
                    list.add("5");
                    list.add("6");
                    list.add("7");
                }
            }
        };
        thread1.start();
        thread4.start();
        thread2.start();
        thread3.start();


        list.stream().forEach(r -> System.out.println(r));

    }
}
