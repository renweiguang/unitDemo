package stream;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 2, new BigDecimal(10000)),
                new Staff("jack", 2, new BigDecimal(20000)),
                new Staff("lawrence", 30, new BigDecimal(30000)));


//
//        staff.stream().sorted(Comparator.comparing(Staff::getSalary).reversed()).collect(Collectors.toList());
//
//
//        staff.sort((one, two) -> {
//            if (one.getAge().equals(two.getAge())) {
//                return one.getSalary().compareTo(two.getSalary());
//            }
//            return one.getAge().compareTo(two.getAge());
//        });
//
//        System.out.println(staff);


//        List<StaffPublic> abc = staff.stream().map(r -> {
//            StaffPublic staffPublic = new StaffPublic();
//            staffPublic.setName(r.getName());
//            staffPublic.setAge(r.getAge());
//            return staffPublic;
//        }).collect(Collectors.toList());
//        System.out.println(abc);

        //Function<Staff, Integer> Function<入参，反参>
//        Function<Staff, Integer> function = r -> r.getAge();
//        List<Staff> a = staff.stream().sorted(Comparator.comparing(function).reversed())
//                .collect(Collectors.toList());
//        System.out.println(a);

//        staff.stream().map(r ->
//        {
//            StaffPublic staffPublic = new StaffPublic();
//            staffPublic.setName(r.getName());
//            return staffPublic.getName();
//        }).collect(Collectors.toList()).forEach(r -> System.out.println(r));
//
//        Map<Integer, StaffPublic> result = staff.stream().map(temp -> {
//            StaffPublic obj = new StaffPublic();
//            obj.setName(temp.getName());
//            obj.setAge(temp.getAge());
//            if ("mkyong".equals(temp.getName())) {
//                obj.setExtra("this field is for mkyong only!");
//            }
//            return Pair.of(obj.getAge(), obj);
//        }).collect(Collectors.toMap(Pair::getKey, Pair::getValue));
//        System.out.println(result);

        List<StaffPublic> list = staff.stream().map(temp ->{
            StaffPublic obj = StaffPublic.builder().name(temp.getName()).age(temp.getAge()).build();
            return obj;
        }).collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * flatMap
     */
    @Test
    public void testFlatMap() {
        //创建一个 装有两个泛型为integer的集合
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
        // 将两个合为一个
        Stream<Integer> integerStream = stream.flatMap(integers -> integers.stream());
        // 为新的集合
        List<Integer> collect = integerStream.collect(Collectors.toList());
        System.out.println("新stream大小:" + collect.size());
        System.out.println("-----合并后-----");
        collect.forEach(o -> System.out.println(o));
    }

    //                System.out.println(s);

    //
    // List<Integer> newList = staff.stream()
    // .map(r ->
    // r.getAge()).collect(Collectors.toList()
    // );
    //
    // System.out.println(newList);

    // List<StaffPublic> r = new ArrayList<>();
    // for (Staff s : staff) {
    // StaffPublic staffPublic = new StaffPublic();
    // staffPublic.setAge(s.getAge());
    // staffPublic.setName(s.getName());
    // if ("mkyong".equals(s.getName())) {
    // staffPublic.setExtra("this field is for mkyong only!");
    // }
    // r.add(staffPublic);
    // }
    // for (StaffPublic staffPublic : r) {
    // System.out.println(staffPublic);
    // }
}
//}
// System.out.println(result);
//
//
// List<StaffPublic> result = staff.stream().map(r -> {
//
// StaffPublic obj = new StaffPublic();
// obj.setName(r.getName());
// obj.setAge(r.getAge());
// if ("mkyong".equals(r.getName())) {
// obj.setExtra("this field is for mkyong only!");
// }
// return obj;
// }).collect(Collectors.toList());
//
// for(StaffPublic staffPublic :result){
// System.out.println(staffPublic);
// }
// System.out.println(result);

// System.out.println(result);
//
// }
