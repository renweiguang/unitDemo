package javaStreamTest;

import java.util.Arrays;

public class TestMap {
    public static void main(String[] args) {

        String[] strs = {"aaa", "bbb", "ccc"};
//        List<String> a1 = Arrays.asList(strs);
//        List<String[]> a = Arrays.asList(strs)
//                .stream()
//                .map(str -> str.split(""))
//                .collect(Collectors.toList());
//        a.forEach(r -> Arrays.asList(r).stream().forEach(r1 -> System.out.println(r1)));

        Arrays.asList(strs)
                .stream()
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(r -> System.out.println(r));

    }
}