package duotaidemo;

public class Cat extends Animal {
    private int age = 19;

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        super.eat();
    }
}
