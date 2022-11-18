package testDemoooo;

import java.util.ArrayList;
import java.util.List;

/**
 * 如何修改list中的元素 阿里爸爸面试题
 */
public class ListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("james");
        list.add("wade");
        System.out.println(list);
        System.out.println(list.get(1));

        list.set(1, "kobe");
        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
