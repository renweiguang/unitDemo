package dongtaidailitest;

/**
 * @author rwg
 * @date 2021/10/21 17:21
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("call doSomething()");
    }
}
