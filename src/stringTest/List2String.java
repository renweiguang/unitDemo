package stringTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List2String {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("aaa");
        list.add(11);
        list.add("ccc");
        String bbb = list.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(bbb);
        String a = listToString(list, ",");
        System.out.println(a);
    }

    private static String listToString(List<Object> list, String separator) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i)).append(separator);
        }
        return stringBuilder.toString();
    }
}
