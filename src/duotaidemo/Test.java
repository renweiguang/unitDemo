package duotaidemo;

/**
 * 多态的前提条件要有 1.继承关系 2.重写方法  父类对象指向子类的引用
 *
 * @param
 */

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        System.out.println(a.getAge());

        Cat cat = new Cat();
        cat.eat();

    }
}
