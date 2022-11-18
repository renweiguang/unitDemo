package testDemoooo;

import java.util.Arrays;
import java.util.List;

public class llll
{
    public static void main(String[] args)
    {
        String[] arr = { "aaa", "bbb", "ccc" };
        System.out.println(Arrays.toString(arr));
        String s = String.join("-", arr);
        System.out.println(s);
        String[] a = s.split("-");
        List<String> list = Arrays.asList(a);
        System.out.println(a);
        list.stream().filter(r -> r.equals("bbb")).forEach(r1 -> System.out.println(r1));
    }
}
