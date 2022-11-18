package staticDemo;

public class StudentDemo
{

    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setAge(15);
        s1.setName("臭宝宝");
        // s1.setSchool("zz");
        s1.show();

        Student s2 = new Student();
        s2.setAge(16);
        s2.setName("小宝宝");
        // s2.setSchool("zz");
        s2.show();
    }
}
