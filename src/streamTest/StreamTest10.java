package streamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author rwg
 * @date 2021/9/30 10:03
 */
public class StreamTest10 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);
//        List<Integer> listNew = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        Set<Integer> set = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Rwg", 8900, 23, "male", "New York"));
        personList.add(new Person("Rwg", 8900, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));


//        Map<String,Person> map = personList.stream().filter(p -> p.getSalary() > 8000)
//                .collect(Collectors.toMap(Person::getName, Function.identity()));

        Map<String,List<Person>> map1 = personList.stream().filter(p -> p.getSalary() > 8000)
                .collect(Collectors.groupingBy(Person::getName));


//        System.out.println("toList:" + listNew);
//        System.out.println("toSet:" + set);
        System.out.println("toMap:" + map1);

        System.out.println(map1);
    }
}
