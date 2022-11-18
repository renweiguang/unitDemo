package streamTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author rwg
 * @date 2021/9/30 9:44
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a2aa", "aaaaa", "aaaaa", "aaa", "aaaaaaaaaaa");

        String max = list.stream().max(Comparator.comparing(String::length)).orElse("aaa");
        System.out.println("最长的字符串：" + max);

        list.stream().sorted(Comparator.comparing(String::length)).forEach(s -> System.out.println(s));
    }
}
