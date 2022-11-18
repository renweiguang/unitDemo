package tryCatch;

import cn.hutool.core.collection.CollectionUtil;

import java.util.ArrayList;
import java.util.List;

public class NullTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        if (CollectionUtil.isEmpty(list)) {
            System.out.println("22");
        }

        Integer a = list.get(0);
        System.out.println("任伟光");
    }

}
