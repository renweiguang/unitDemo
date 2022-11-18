package stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        Map<Integer, String> abcMap = new HashMap<>();
        abcMap.put(19, "19");
        abcMap.put(14, "14");
        abcMap.put(2, "2");
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
        // 将HashMap转换成LinkedHashMap
        abcMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(entry -> linkedMap.put(entry.getKey(), entry.getValue()));
        System.out.println(linkedMap);

        // 如果想要转换成List
        linkedMap.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList())
                .forEach(r -> System.out.println(r));
    }
}
