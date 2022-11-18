import java.util.HashMap;
import java.util.Map;

public class duplicateInt2 {
    public static void duplicateInt2(int[] array) {
        if (array == null) {
            return;
        }
        // 存在重复数字，起码有两个以上的数字才可以
        int len = array.length;
        if (len < 2) {
            return;
        }
        for (int i = 0; i < len; i++) {
            // 数字中的数字范围在0到len-1之间，否则就认为是个错误的数组，不考虑重复数字问题
            if (array[i] < 0 || array[i] > len - 1) {
                return;
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        return;
    }
}
