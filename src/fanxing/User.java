package fanxing;

import lombok.Data;

@Data
public class User<T> {
    private T name;

    //泛型测试方法
    //无论放入什么数据类型，都可以正常执行
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("zwz");
        System.out.println(user1.getName() instanceof String);

        User user2 = new User();
        user2.setName(123456);
        System.out.println(user2.getName() instanceof Integer);

        User user3 = new User();
        user3.setName(123.6);
        System.out.println(user3.getName() instanceof Double);
    }
}
