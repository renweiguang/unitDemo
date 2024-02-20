package streamTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

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


        BigDecimal a= BigDecimal.valueOf(0.01);
        System.out.println(a);

        if(Objects.equals(new BigDecimal("0.01"),a)){
            System.out.println(2);
        }
    }
}
