package mapTest;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author rwg
 * @date 2021/10/22 11:29
 */
public class Test {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("d", Arrays.asList(1,2,4,5));
        map.put("b", Arrays.asList(11,22,44,55));
        map.put("a", Arrays.asList(111,222,444,555));
        map.put("c", Arrays.asList(1114,2222,4444,5555));


        System.out.println(map.values());

        System.out.println(map.values().stream().collect(Collectors.toList()));

    }
}
