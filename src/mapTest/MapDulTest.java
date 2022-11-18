package mapTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rwg
 * @date 2021/10/27 19:20
 */
public class MapDulTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(1, "bbb");
        System.out.println(map.get(1));
    }
}
