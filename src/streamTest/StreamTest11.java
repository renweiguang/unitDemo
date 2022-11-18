package streamTest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author rwg
 * @date 2021/9/30 10:06
 */
public class StreamTest11 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));

        // 求总数
        Long count = personList.stream().count();
        // 求平均工资
        Double average = personList.stream().collect(Collectors.averagingDouble(Person::getSalary));
        // 求最高工资
        Function<Person, Integer> function = r -> r.getSalary();
        Optional<Integer> a = personList.stream().sorted(Comparator.comparing(function).reversed()).map(Person::getSalary).findFirst();
        System.out.println(a);
        // 求工资之和
        Integer sum = personList.stream().collect(Collectors.summingInt(Person::getSalary));
        // 一次性统计所有信息
        DoubleSummaryStatistics collect = personList.stream().collect(Collectors.summarizingDouble(Person::getSalary));

        System.out.println("员工总数：" + count);
        System.out.println("员工平均工资：" + average);
        System.out.println("员工工资总和：" + sum);
        System.out.println("员工工资所有统计：" + collect);
    }
}
