package tryCatch;

import cn.hutool.core.collection.CollectionUtil;

import java.util.ArrayList;
import java.util.List;

public class NullTest {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        list.addAll(list2);
//        System.out.println(list);
//
//        Integer a = null;
//
//        System.out.println(a == 1);
        String a = "*.";
        boolean b =containsOnlyLowerCaseLetters(a);
        System.out.println(b);

        String c = "123123dq";
        boolean d = isNumeric(c);
        System.out.println(d );

//        if (CollectionUtil.isEmpty(list)) {
//            System.out.println("22");
//        }
//
//        Integer a = list.get(0);
//        System.out.println("任伟光");
    }


    public static boolean containsOnlyLowerCaseLetters(String str) {
        return str.matches("[*,/,-,.]+");
    }

    public static  boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?([eE]\\d+)?");
    }

}
