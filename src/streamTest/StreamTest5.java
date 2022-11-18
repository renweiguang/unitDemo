package streamTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author rwg
 * @date 2021/9/30 9:54
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 6, 4, 8, 2, 11, 9);

        long count = list.stream().filter(x -> x > 6).count();
        System.out.println("list中大于6的元素个数：" + count);
    }
}
