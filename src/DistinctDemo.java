import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DistinctDemo {
    public static void main(String[] args) {
        List<TestDTO> list = new ArrayList<TestDTO>() {
            {
                add(TestDTO.builder().id(1L).parameter("111").param("111").build());
                add(TestDTO.builder().id(1L).parameter("111").param("1111").build());
                add(TestDTO.builder().id(2L).parameter("111").param("111").build());
                add(TestDTO.builder().id(2L).parameter("111").param("1111").build());
            }
        };

//        System.out.println(list.stream().distinct().collect(Collectors.toList()));


        ArrayList<TestDTO> collect = list.stream()
                .collect(Collectors.collectingAndThen(Collectors.toCollection(() ->
                        new TreeSet<>(Comparator.comparing(o -> o.getId() + ";" + o.getParameter()))), ArrayList::new));
        System.out.println(collect);
    }
}
