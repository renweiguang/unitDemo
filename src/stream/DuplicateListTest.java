package stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author renwg
 * @date 2022/8/29
 */
public class DuplicateListTest {
    public static void main(String[] args) {
        List<Object> list = Lists.newArrayList("2", "2", "3", "4", "5");
        Object key = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("出现频次最高的元素是：" + key);
    }
}
