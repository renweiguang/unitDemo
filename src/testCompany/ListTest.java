package testCompany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest {
    public static void main(String[] args) {

        User u1 = new User(1, "22", 1);
        User u2 = new User(1, "333", 2);
        User u3 = new User(2, "444", 7);
        User u4 = new User(1, "2133", 9);

        Set<String> set = new HashSet<>();
        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        System.out.println(list);
        for (User user : list) {
            set.add(user.getName());
        }

        System.out.println(set);

    }
}
