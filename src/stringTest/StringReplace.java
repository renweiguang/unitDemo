package stringTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author rwg
 * @date 2021/9/18 14:40
 */
public class StringReplace {
    public static void main(String[] args) {
        String a = "aa-aa-a_a_q_a-q";
        String b = a.replace('-', '+').replace('_', '/');
        String c = "2022.01.08";
        String d = c.replace(".","");
        System.out.println(d);
        System.out.println(b);
        System.out.println();


        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        List<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("D");
        List<String> mergedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        System.out.println(mergedList);  // [A, B, C, D]

    }
}
