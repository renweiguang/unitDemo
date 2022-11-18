package interfaceDemo;

public class JumppingDemo {

    // 接口也能new对象
    public static Jumpping a;

    public static void main(String[] args) {
        CatImpl cat = new CatImpl();
        cat.jump();
        // 多态，接口 = new 实现类
        Jumpping a = new CatImpl();
        a.jump();
    }
}
