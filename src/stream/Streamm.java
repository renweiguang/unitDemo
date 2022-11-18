package stream;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamm {
    public static void main(String[] args) {
        List<User> list = getList();
        List<String> flatMapList = getFaltMap();
//       List<User> users = list.stream().map(String::valueOf).map(str -> JSON.parseObject(str,User.class)).collect(Collectors.toList());

//       users.stream().forEach(r-> System.out.println(r));

//        Map<String, List<User>> map = list.stream().collect(Collectors.groupingBy(User::getName));
//        System.out.println("sadasasasasasasasasasasasasasasasas:"+map);
//        map.forEach((name, user) -> {
//            System.out.println("user:" + user);
//            Map<String, String> map1 = user.stream().collect(Collectors.toMap(key -> key.getName(), value -> JSONObject.toJSONString(value)));
//            Map<String, User> map2 = user.stream().collect(Collectors.toMap(User::getName, Function.identity()));
//            System.out.println("map2:" + map2);
//
//            map1.forEach((a, b) -> {
//                System.out.println(a);
//                System.out.println(b);
//            });
//            map1.entrySet().stream().filter(r -> r.getKey().equals("姬如雪")).forEach(r -> System.out.println("key为" + r.getKey() + "  value为" + r.getValue()));
//        });


        //过滤掉年龄小于20的童鞋
        list.stream()
                .filter(r -> r.getAge() > 20)
                .forEach(r -> System.out.println(r));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //distinct去重
        list.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(r -> System.out.println(r));


        System.out.println(" distinct去重 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //按照年龄排序
        list.stream()
                .sorted(Comparator.comparing(User::getAge).reversed())
                .collect(Collectors.toList())
                .forEach(r -> System.out.println(r));

        System.out.println(" 按照年龄排序 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //map改变数据类型
        //map和foreach的区别是，foreach没有返回值，map有返回值。
        List<String> a = list.stream()
                .map(User::getName)
                .distinct()
                .collect(Collectors.toList());
        a.stream().forEach(r -> System.out.println(r));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        /**
         *  这里原集合中的数据由逗号分割，使用split进行拆分后，得到的是Stream<String[]>，
         *             字符串数组组成的流，要使用flatMap的Arrays::stream
         *             将Stream<String[]>转为Stream<String>,然后把流相连接
         */
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        Map<String, List<String>> map = flatMapList.stream()
                .map(r -> r.split(","))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(Function.identity()));
        map.values().stream().forEach(r -> r.stream().forEach(r1 -> System.out.println(r1)));
        System.out.println("流相连接 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //返回list的数量
        System.out.println(list.stream().count());

        Optional<User> max = list.stream()
                .collect(
                        Collectors.maxBy(
                                Comparator.comparing(User::getAge)
                        )
                );
        Optional<User> min = list.stream()
                .collect(
                        Collectors.minBy(
                                Comparator.comparing(User::getAge)
                        )
                );
        System.out.println("max--> " + max + "  min--> " + min);

        System.out.println("..........................................................");
        List<User> userList2 = list
                .stream()
                .filter(user -> user.getAge() > 20)
                .map(user -> {//将过滤得到的user对象的年龄设置为50
                    user.setName("rwg");//执行你想要的操作，每个元素会映射产生新元素，所以map()方法要有返回值
                    return user;//返回新元素
                }).collect(Collectors.toList());//将流转为集合

        System.out.println(userList2);
        System.out.println("..........................................................");

    }

    public static List<User> getList() {
        List<User> list = Arrays.asList(
//                new User("李星云", 18, 0, "渝州", new BigDecimal(1000)),
                new User("李星云", 18, 0, "渝州", new BigDecimal(1000)),
//                new User("陆林轩", 16, 1, "渝州", new BigDecimal(500)),
                new User("姬如雪", 17, 1, "幻音坊", new BigDecimal(800)),
                new User("袁天罡", 99, 0, "藏兵谷", new BigDecimal(100000)),
                new User("张子凡", 19, 0, "天师府", new BigDecimal(900)),
                new User("陆佑劫", 45, 0, "不良人", new BigDecimal(600)),
                new User("张天师", 48, 0, "天师府", new BigDecimal(1100)),
                new User("蚩梦", 18, 1, "万毒窟", new BigDecimal(800))
        );
        return list;
    }

    public static List<String> getFaltMap() {
        List<String> flatMapList = new ArrayList<>();
        flatMapList.add("常宣灵,常昊灵");
        flatMapList.add("孟婆,判官红,判官蓝");
        return flatMapList;
    }
}