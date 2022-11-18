package http;

import java.util.*;

/**
 * @author rwg
 * @date 2021/10/15 18:26
 */
public class Test05 {

    // map转换成list
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static List mapTransitionList(Map map) {
        List list = new ArrayList();
        Iterator iter = map.entrySet().iterator(); // 获得map的Iterator
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            list.add(entry.getKey());
            list.add(entry.getValue());
        }
        return list;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Map map = new HashMap();
        map.put("aaa", 11);
        map.put("bbb", "22ss");
        map.put("ccc", "汉字");
        @SuppressWarnings("rawtypes")
        List list = mapTransitionList(map);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}