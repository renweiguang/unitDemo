package concurrentList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 当线程A执行遍历的第一次时，正常的打印出集合元素，线程B也正常的执行，我们无法控制CPU的调度，所以运用线程等待的方式，
 * 让第二个线程稍快与第一个线程，以检测出异常。当线程A等待的时候，线程B调用remove方法，此时modCount 值已经自增，而未执行到expectedModCount = modCount的代码，
 * 此时expectedModCount != modCount，这个时候线程A等待结束，进行第二次循环，当执行String str = iterator.next();时，
 * 会进行异常检测，此时因为expectedModCount != modCount而抛出异常。
 */
public class IteratorTest {
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
//                如果不想报错，建议用这种方式，避免同时操作一个list
                List<String> stringList = new ArrayList<>();
                stringList.addAll(list);

                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    String str = iterator.next();
                    System.out.println(str);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    String str = iterator.next();
                    if (str.equals("lisi")) {
                        iterator.remove();
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}