package toString;

/**
 * toString方法的作用是如果不重写toString方法，那么Person p = new Person(); SOUT(P) 输出的是对象的地址。 在Person类重写之后，可以
 * return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
 *
 * @Data 注解默认重写toString方法
 */


public class ToStringDemo {
    public static void main(String[] args) {
        Person p = new Person();

        p.setAge(1);
        p.name = "2";
        p.sex = "1";
        System.out.println(p);
    }
}
