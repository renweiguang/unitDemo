package lianxi;

public class UserDemo
{
    public static void main(String[] args)
    {
        int age = 22;
        String name = "rwg";
        String sex = "m";

        User user = new User(age, name, sex);

        System.out.println(user.getName());
    }
}
