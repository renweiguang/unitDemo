package dongtaidailitest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author rwg
 * @date 2021/10/21 17:22
 */

public class ProxyHandler implements InvocationHandler {
    private Object tar;

    //绑定委托对象，并返回代理类
    public Object bind(Object tar) {
        this.tar = tar;
        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(),
                tar.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        System.out.println("代理之前做些事");
        result = method.invoke(tar, args);
        System.out.println("代理只会做些事");
        //在调用具体函数方法后，执行功能处理
        return result;
    }
}
