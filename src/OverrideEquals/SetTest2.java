package OverrideEquals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rwg
 * @date 2021/10/27 20:00
 */
public class SetTest2 {

    public static void main(String[] args) {

        Set<People> set = new HashSet<>();

        set.add(new People("abc"));
        set.add(new People("xyz"));
        set.add(new People("abc"));

//        for (Iterator<People> iter = set.iterator(); iter.hasNext(); ) {
//            System.out.println(iter.next().getName());
//
//        }


        People people = new People("abc");
        People people1 = new People("abc");
        System.out.println(people.hashCode() == people1.hashCode());
    }
}

class People {

    String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public int hashCode() {
//        return name.hashCode();
//    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof People) {

            //1.先把Object类 转换为People类
            People people = (People) anObject;
            //2.我们定义两个people对象相等的条件是 二者的name相同
            //2.1当然这里完全可以根据具体的场景来自定义
            if (this.name.equals(people.getName())) {
                return true;
            }
        }
        return false;
    }
}

