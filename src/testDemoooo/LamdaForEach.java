package testDemoooo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");

        // list.forEach(r -> {
        // if ("111".equals(r)) {
        // list.remove(r);
        // }
        // });
        // for (String l : list) {
        // if ("111".equals(l)) {
        // list.remove(l);
        // }
        // }
        List<String> list1 = list
                .stream()
                .filter(r -> !r.equals("111"))
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
