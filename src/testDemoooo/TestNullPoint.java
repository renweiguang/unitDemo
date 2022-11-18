package testDemoooo;

public class TestNullPoint {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Change.dogToNull(dog);
        dog.eat();// 会空指针吗？
        // 不会，因为调用上面那个方法的返回值是void 所以其实真正的值并没有变化，还是new出来的那个dog
    }
}

class Dog {
    void eat() {
        System.out.println("eat()");
    }
}

class Change {
    static void dogToNull(Dog dog) {
        dog = null;
    }
}
