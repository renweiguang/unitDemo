package extendDemo;

/**
 * @author rwg
 * @date 2021/10/13 16:54
 */
public class Animals {
    public void call() {
        System.out.println("啊啊啊啊啊啊啊");
    }
}


class Cat extends Animals {
    @Override
    public void call() {

        System.out.println("喵喵喵喵喵");
    }
}


class Dog extends Animals {

    @Override
    public void call() {
        System.out.println("汪汪汪汪汪汪");
    }

    public static void main(String[] args) {
        Animals animals = new Cat();
        animals.call();

        Cat cat = new Cat();
        cat.call();

        Dog dog = new Dog();
        dog.call();
    }

}
