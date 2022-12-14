package javaStreamTest;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamAPI {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("欧阳雪", 18, "中国", 'F'));
        personList.add(new Person("Tom", 24, "美国", 'M'));
        personList.add(new Person("Harley", 22, "英国", 'F'));
        personList.add(new Person("向天笑", 20, "中国", 'M'));
        personList.add(new Person("李康", 22, "中国", 'M'));
        personList.add(new Person("小梅", 20, "中国", 'F'));
        personList.add(new Person("何雪", 21, "中国", 'F'));
        personList.add(new Person("李康", 22, "中国", 'M'));

        // skip
        Person person = personList.stream().filter(p -> p.getSex() == 'F').skip(1).findFirst().orElse(null);
        System.out.println(person);

        System.out.println("--------------------------------------------------------");

        // 1）找到年龄大于18岁的人并输出；
        personList.stream().filter((p) -> p.getAge() > 18).forEach(System.out::println);

        System.out.println("-------------------------------------------");

        // 2）找出所有中国人的数量
        long chinaPersonNum = personList.stream().filter((p) -> p.getCountry().equals("中国")).count();
        System.out.println("中国人有：" + chinaPersonNum);

        System.out.println("dwqdqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
        // limit
        personList.stream().filter((p) -> p.getSex() == 'F').limit(2).forEach(System.out::println);
        System.out.println("dwqdqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");


        // distinct
        personList.stream().filter((p) -> p.getSex() == 'M').distinct().forEach(System.out::println);

        // map
        personList.stream().map((p) ->
        {
            PersonCountry personName = new PersonCountry();
            personName.setCountry(p.getCountry());
            return personName;
        }).distinct().forEach(System.out::println);

        // map2
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "ddd");

        final Stream<Stream<Character>> streamStream = list.stream().map(TestStreamAPI::getCharacterByString);
        // streamStream.forEach(System.out::println);
        streamStream.forEach(sm -> sm.forEach(System.out::print));

        // flatMap
        final Stream<Character> characterStream = list.stream()
                .flatMap(TestStreamAPI::getCharacterByString);
        characterStream.forEach(System.out::print);

        // sort
        final Stream<Person> sorted = personList.stream().sorted((p1, p2) ->
        {

            if (p1.getAge().equals(p2.getAge())) {
                return p1.getName().compareTo(p2.getName());
            } else {
                return p1.getAge().compareTo(p2.getAge());
            }
        });
        sorted.forEach(System.out::println);

        // allMatch
        final Stream<Person> stream = personList.stream();
        final boolean adult = stream.allMatch(p -> p.getAge() >= 18);
        System.out.println("是否都是成年人：" + adult);

        final boolean chinaese = personList.stream().allMatch(p -> p.getCountry().equals("中国"));
        System.out.println("是否都是中国人：" + chinaese);

        // max min
        final Optional<Person> maxAge = personList.stream().max((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
        System.out.println("年龄最大的人信息：" + maxAge.get());

        final Optional<Person> minAge = personList.stream().min((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
        System.out.println("年龄最小的人信息：" + minAge.get());

        // reduce
        List<Integer> integerList = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            integerList.add(i);
        }
        final Integer reduce = integerList.stream().reduce(0, (x, y) -> x + y);
        System.out.println("结果为：" + reduce);

        final Optional<Integer> totalAge = personList.stream().map(Person::getAge).reduce(Integer::sum);
        System.out.println("年龄总和：" + totalAge);

        // collect
        final List<String> collect = personList.stream().map(p -> p.getCountry()).distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

        final Double collect1 = personList.stream().collect(Collectors.averagingInt(p -> p.getAge()));
        System.out.println("平均年龄为：" + collect1);

        final Optional<Integer> maxAge2 = personList.stream().map(Person::getAge)
                .collect(Collectors.maxBy(Integer::compareTo));
        System.out.println(maxAge2.get());

        try (final Stream<Integer> integerStream = personList.stream().map(Person::getAge)) {
            final Optional<Integer> minAge2 = integerStream.collect(Collectors.minBy(Integer::compareTo));
            System.out.println(minAge2.get());
        }
    }

    public static Stream<Character> getCharacterByString(String str) {

        List<Character> characterList = new ArrayList<>();

        for (Character character : str.toCharArray()) {
            characterList.add(character);
        }

        return characterList.stream();
    }
}

@Data
class PersonCountry {
    private String name;
    private Integer age;
    private String country;
    private char sex;
}

@Data
class Person {
    private String name;
    private Integer age;
    private String country;
    private char sex;

    public Person(String name, Integer age, String country, char sex) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }
}
