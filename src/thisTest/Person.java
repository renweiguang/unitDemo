package thisTest;

/**
 * @author rwg
 * @date 2021/10/14 11:03
 */
public class Person {  // 定义Person类


    private String name;  // 姓名
    private int age;   // 年龄

    public Person(String name, int age) { // 通过构造方法赋值
        name = name;
        age = age;
    }

    public String getInfo() { // 取得信息的方法
        return "姓名：" + name + "，年龄：" + age;
    }
}

class ThisDemo01 {
    public static void main(String args[]) {
        Person per1 = new Person("张三", 33); // 调用构造实例化对象
        System.out.println(per1.getInfo()); // 取得信息
    }
}