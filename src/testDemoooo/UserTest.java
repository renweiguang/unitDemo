package testDemoooo;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("111", 111, "男");
        User user2 = new User("222", 222, "女");
        User user3 = new User("333", 333, "男");

        List<User> list = new ArrayList<>();

        list.add(user1);
        list.add(user2);
        list.add(user3);

        System.out.println(list);

        for (User user : list) {
            System.out.println(user);
        }
    }
}
