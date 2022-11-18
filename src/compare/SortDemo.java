package compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

    public static void main(String[] args) {
        List<Student> stuList = Arrays.asList(
                new Student("小涂", 23),
                new Student("小刘", 21),
                new Student("小王", 25));
        System.out.println("排序前的stuList集合：");

        for (Student student : stuList) {
            System.out.print(student.getName() + student.getAge() + " ");
        }


        //实现Comparator进行排序
        Collections.sort(stuList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Student) o1).getAge() - ((Student) o2).getAge();
            }
        });

        System.out.println();
        System.out.println("按照年龄降序排序后的stuList集合：");
        for (Student student : stuList) {
            System.out.print(student.getName() + student.getAge() + " ");
        }
    }
}