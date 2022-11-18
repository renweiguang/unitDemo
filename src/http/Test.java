package http;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author rwg
 * @date 2021/10/15 17:59
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("pageNo", "1");
        map.put("pageSize", "10");
        map.put("platformCode", "BLLC9M3Q2");
        map.put("seq", "1559817133443");
        map.put("timestamp", "1559817133443");

        List<String> kvList = new ArrayList<>();
        map.forEach((k, v) -> {
            kvList.add(k + "=" + v);
        });
        String signatureString = kvList.stream().collect(Collectors.joining("&"));
        System.out.println(signatureString);
    }
}
