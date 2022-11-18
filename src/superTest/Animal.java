package superTest;

/**
 * 本栗子说明，调用子类的构造方法，会默认先调父类的构造方法
 * 如果父类的方法被继承，那么先执行父类的方法，再执行子类的方法。
 */
public class Animal {
    int eye = 2;

    public Animal() {
        super();
        System.out.println("动物");

    }

    public void run() {
        System.out.println("动物有不同走路方式");
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        b.run();
    }
}

class Bird extends Animal {
    public Bird() {
        super();
        System.out.println("鸟类");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run(); // 通过super可以用父类方法和属性
        System.out.println("鸟是飞飞飞飞飞飞");
        System.out.println("鸟类有" + super.eye + "只眼睛");
    }

}
