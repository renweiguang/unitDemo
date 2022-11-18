package streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author rwg
 * @date 2021/9/30 9:58
 */
public class StreamTest8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("m,k,l,a", "1,3,5,7");

//        List<String> listNew = list.stream().map(r-> r.split(",")).flatMap(Arrays::stream).collect(Collectors.toList());


        List<String> listNew = list.stream().flatMap(s -> {
            // 将每个元素转换成一个stream
            String[] split = s.split(",");
            Stream<String> s2 = Arrays.stream(split);
            return s2;
        }).collect(Collectors.toList());

        System.out.println("处理前的集合：" + list);
        System.out.println("处理后的集合：" + listNew);
    }
}
