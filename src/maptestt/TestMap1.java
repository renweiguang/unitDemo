package maptestt;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rwg
 * @date 2021/10/27 19:46
 */
public class TestMap1 {
    public static void main(String[] args) {

        PrettyGirl prettyGirl = new PrettyGirl();

        Map<PrettyGirl,String> map = new HashMap<>();

        map.put(prettyGirl, "Java编程技术乐园");

        map.put(prettyGirl, "生活在长沙的延安人");

        map.put(prettyGirl, "期待和你加入乐园");

        System.out.println("map :" + map.toString());

        MyHashMap<PrettyGirl> myMap = new MyHashMap<PrettyGirl>();

        myMap.put(prettyGirl, "Java编程技术乐园");

        myMap.put(prettyGirl, "生活在长沙的延安人");

        myMap.put(prettyGirl, "期待和你加入乐园");

        System.out.println("myMap :" + myMap.toString());
    }
}
