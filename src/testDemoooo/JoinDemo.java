package testDemoooo;

import java.util.Arrays;
import java.util.List;

public class JoinDemo {
    public static void main(String[] args) {
        // 定义一个数组
        String[] names = {"JAMES", "WADE", "KOBE"};
        // 利用join方法将其整理成以-为分隔的字符串
        String join = String.join("-", names);
        System.out.println(join);
        // 将-分隔的字段传变成数组
        String[] a = join.split("-");
        // 将数组变为list
        List<String> list = Arrays.asList(a);
        // 遍历list
        list.forEach(r -> System.out.println(r));
        System.out.println(list);
    }
}
