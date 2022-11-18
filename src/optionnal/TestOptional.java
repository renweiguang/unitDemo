package optionnal;

import java.util.Optional;

/**
 * @author rwg
 * @date 2021/10/29 19:44
 */
public class TestOptional {
    public static void main(String[] args) {
//        User user = null;
//       String string = Optional.ofNullable(user).map(User::getAdress).orElse("null");

        User user = new User();
        if (user == null) {
            System.out.println("user : null");
        }
        String string = Optional.ofNullable(user).map(User::getAdress).orElse("null");

        System.out.println(string);
    }
}
