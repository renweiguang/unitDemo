package list;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author rwg
 * @date 2021/9/7 11:53
 */
public class TestFliter {
    public static void main(String[] args) {
        List<String> zimuLists = new ArrayList<>();
        List<String> zimuLists2 = Lists.newArrayList("a", "b", "c", "d", "e", "f", "g", "h");

//        List<List<String>> lists = Lists.partition(zimuLists, 3);
//
//        lists.forEach(r -> {
//            r.stream().forEach(r1 -> System.out.println(r1));
//        });

        //留下为true的
        zimuLists.stream().filter(r -> r.equals("a")).collect(Collectors.toList());

        //删掉为true的
        zimuLists.removeIf(r -> {
            if (r.equals("a")) {
                return true;
            } else {
                return false;
            }
        });
        System.out.println(zimuLists);

        System.out.println("------------------------------------------------------------");


        //留下true的
        List<String> aaa = zimuLists2.stream().filter(r -> {
            if (r.equals("a")) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println(aaa);
    }
}
