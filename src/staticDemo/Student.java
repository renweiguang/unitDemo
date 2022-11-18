package staticDemo;

public class Student
{

    private String name;
    private int age;
    private static String school = "zz";

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSchool()
    {
        return school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    public void show()
    {
        System.out.println(name + "," + age + "," + school);
    }
}
