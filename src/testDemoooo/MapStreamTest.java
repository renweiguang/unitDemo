package testDemoooo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(5);

        List<Integer> newList = list
                .stream()
                .map(r -> r * r)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(newList);

        newList.forEach(r -> System.out.println(r));

    }
}
