package javaStreamTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class testFlatMap {
    public static void main(String[] args) {
        //创建一个 装有两个泛型为integer的集合
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
        // 将两个合为一个
//        Stream<Integer> integerStream = stream.flatMap(Collection::stream);
        Stream<Integer> integerStream = stream.flatMap(Collection::stream);
        // 为新的集合
        List<Integer> collect = integerStream.collect(toList());
        System.out.println("新stream大小:" + collect.size());
        System.out.println("-----合并后-----");
        collect.forEach(o -> System.out.println(o));
    }
}
