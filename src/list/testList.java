package list;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author rwg
 * @date 2021/8/16 14:33
 */
public class testList {
    public static void main(String[] args) {
        List<Integer> numList = Lists.newArrayList(1, 1, 2, 3, 4, 5, 6, 7, 8);
        List<List<Integer>> lists = Lists.partition(numList, 3);
        Map<Integer, List<Integer>> map = lists.stream().flatMap(Collection::stream).collect(Collectors.groupingBy(Function.identity()));
        map.values().stream().forEach(r -> r.stream().forEach(t -> System.out.println(t)));
    }
}
