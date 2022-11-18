package extendDemo;

public class Zi extends Fu {
    // 本类的成员变量
    private int age = 18;

    public void show1() {
        // 定义在方法里的对象
        int age = 18;
        System.out.println("子被调用");
        // 这个age访问的是方法里的
        System.out.println("方法里的变量age：" + age);
        System.out.println(height);

        // 访问本类的成员变量 怎么办？
        System.out.println("本类的成员变量age：" + this.age);

        // 访问父类的成员变量 怎么办？
        System.out.println("父类的成员变量age：" + super.age);
    }

    @Override
    public void show2() {
        System.out.println("同一方法子类被调用");
    }
}
