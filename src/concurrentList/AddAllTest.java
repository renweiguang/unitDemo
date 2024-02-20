package concurrentList;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AddAllTest
 * @Description TODO
 * @Author renwg
 * @Date 2023/6/28 15:22
 * @Version 1.0
 */
public class AddAllTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list1.addAll(list2);
        System.out.println(list1);
    }
}