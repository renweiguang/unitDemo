package jingtaidailitest;

/**
 * @author rwg
 * @date 2021/10/21 17:17
 */
public class SubjectProxy implements Subject {

    Subject subimpl = new RealSubject();

    @Override
    public void doSomething() {
        System.out.println("代理之前做些事");
        subimpl.doSomething();
        System.out.println("代理之后做些事");
    }
}
