package javaStreamTest;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class TestStream {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("欧阳雪", 18, "中国", 'F'));
        personList.add(new Person("Tom", 24, "美国", 'M'));
        personList.add(new Person("Harley", 22, "中国", 'M'));
        personList.add(new Person("向天笑", 20, "中国", 'M'));
        personList.add(new Person("Harley", 22, "中国", 'M'));
        personList.add(new Person("小梅", 20, "中国", 'F'));

        //        List<Person> list = personList.stream().filter(r -> r.getAge() > 21).distinct().collect(Collectors.toList());
        //        list.stream().forEach(r-> System.out.println(r));
        //        personList.stream().filter(r -> r.getAge() > 18).forEach(r1 -> System.out.println(r1));
        //        List<Person> list1 = personList.stream()
        //                .filter(r -> (!r.getName().equals("欧阳雪")) && (!r.getName().equals("Harley")))
        //                .collect(Collectors.toList());
        //        list1.stream().forEach(r -> System.out.println(r));
        //        personList.stream().filter(r -> r.getSex() == 'F').skip(1).forEach(r1 -> System.out.println(r1));
        //
        Map<Integer, List<PersonCountry>> personCountryMap = personList.stream().map(r ->
        {
            PersonCountry pc = new PersonCountry();
            pc.setCountry((r.getCountry()));
            pc.setSex(r.getSex());
            pc.setAge(r.getAge());
            pc.setName(r.getName());
            return pc;
        }).collect(Collectors.groupingBy(PersonCountry::getAge));

        personCountryMap.forEach((a, b) -> {
            System.out.println(a);
            System.out.println(b);
        });

        //                log.info(String.valueOf(list));
        //                log.info(String.valueOf(list1));
    }
}
