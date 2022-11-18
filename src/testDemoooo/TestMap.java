package testDemoooo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * LinkedHashMap 按照顺序输出。基于链表。
 * TreeMap 底层红黑树
 * HashMap 线程不安全，基于hash表
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("james", "大猿向前冲1");
        map.put("wade", "大猿向前冲2");
        map.put("kobe", "大猿向前冲3");

        System.out.println(map.get("james"));

        map.entrySet()
                .stream()
                .filter(r -> r.getValue().equals("大猿向前冲3"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(r -> System.out.println(r));

        // 遍历map先把map转为set
        // Set<Map.Entry<String, String>> entries = map.entrySet();
        //
        // for(Map.Entry<String,String> m :entries){
        //
        // System.out.println(m.getKey()+" "+m.getValue());
        // }
        //        Set<Map.Entry<String, String>> entries = map.entrySet();
        //        for (Map.Entry<String, String> entry : entries)
        //        {
        //            System.out.println(entry.getKey() + "   " + entry.getValue());
        //        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }
    }
}
