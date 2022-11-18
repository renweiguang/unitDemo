package jingTaiDaiLi;

public class ProxyTest {
    public static void main(String[] args) {
        HelloServiceStaticProxy helloServiceStaticProxy = new HelloServiceStaticProxy(new HelloServiceImpl());
        helloServiceStaticProxy.hello();
    }

}
