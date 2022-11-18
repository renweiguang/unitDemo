package dongtaidailitest;

/**
 * @author rwg
 * @date 2021/10/21 17:22
 */

/**
 * bind方法只需要传入接口的实现类（真正的被代理类）真正的代理类的增加逻辑实在ProxyHandler这个里面干了， 这样就将真正的代理类抽出来成为公共方法，
 * 与静态代理的区别是 静态代理需要为每一个被代理类创建代理类，而动态代理只需要创建一个公共的代理类就可以了。
 * 下例就是两个不同的被代理类被ProxyHandler公共代理方法代理的例子 分别作了增加  也没有为两个代理类分别建立代理类，而是使用了公共的代理类。
 */

public class TestProxy {
    public static void main(String args[]) {
        ProxyHandler proxy = new ProxyHandler();

        //绑定该类实现的所有接口
        Subject sub = (Subject) proxy.bind(new RealSubject());
        sub.doSomething();

        System.out.println("-----------------------------------------");

        Movie movie = (Movie) proxy.bind(new RealMovie());
        movie.movie();
    }
}
