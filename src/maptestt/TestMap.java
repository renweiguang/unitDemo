package maptestt;

/**
 * @author rwg
 * @date 2021/10/27 19:42
 */
public class TestMap {
    public static void main(String[] args) {
        MyHashMap<String> map = new MyHashMap<String>();

        map.put("aflyun", "Java编程技术乐园");

        map.put("aflyun", "生活在长沙的延安人");

        map.put("aflyun", "期待你加入乐园");

        System.out.println(map.toString());
    }
}
