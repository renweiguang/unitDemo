package jingtaidailitest;

/**
 * @author rwg
 * @date 2021/10/21 17:18
 */
public class TestProxy {
    public static void main(String args[]) {
        Subject sub = new SubjectProxy();
        sub.doSomething();
    }
}
