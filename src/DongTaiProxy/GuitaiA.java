package dongTaiProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GuitaiA implements InvocationHandler {

    private Object pingpai;

    public GuitaiA(Object pingpai) {
        this.pingpai = pingpai;
    }

    // public static Object newProxyInstance(ClassLoader loader,
    // Class<?>[] interfaces,
    // InvocationHandler h)
    // * loader 自然是类加载器
    // * interfaces 代码要用来代理的接口
    // * h 一个 InvocationHandler 对象

    // proxy 代理对象
    // method 代理对象调用的方法
    // args 调用的方法中的参数

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("销售开始  柜台是： " + this.getClass().getSimpleName());
        method.invoke(pingpai, args);
        System.out.println("销售结束");
        return null;
    }

}
