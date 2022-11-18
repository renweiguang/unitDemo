package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class flatMapTest {
    public static void main(String[] args) {
        List<String> helloWorld = Arrays.asList("HELLO", "WORRRRLD");

        Map<String, List<String>> streamMap = helloWorld.stream()
                .map(r -> r.split(""))
                .flatMap(r -> Arrays.stream(r))
                .collect(Collectors.groupingBy(Function.identity()));

        streamMap.forEach((a, b) -> {
            System.out.println(a);
            System.out.println(b.stream().collect(Collectors.joining(",")));
        });
    }
}
