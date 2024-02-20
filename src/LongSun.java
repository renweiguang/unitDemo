import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName LongSun
 * @Description TODO
 * @Author renwg
 * @Date 2023/11/10 11:04
 * @Version 1.0
 */
public class LongSun {
    public static void main(String[] args) {
//        Long a = 100L;
//        Long b = 1L;
//        System.out.println(a+b);
//
//        Map<String,String> map = new HashMap<>();
//        if (Objects.isNull(map)){
//            System.out.println("123123123");
//        }


        List<String> list = new ArrayList<>();
       Map<String,String> stringHashMap = list.stream().collect(Collectors.toMap(Function.identity(),Function.identity()));
        System.out.println(stringHashMap);
       stringHashMap.get(1);


    }
}