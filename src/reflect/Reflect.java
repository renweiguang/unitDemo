package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Cat
{
    private String color;

    public Cat(String color)
    {
        System.out.println(color);
    }
}

public class Reflect
{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException
    {

        // 反射有参的构造方法
        Class<Cat> catClass = Cat.class;
        Constructor<Cat> red = catClass.getConstructor(String.class);
        // 调用有参构造方法
        red.newInstance("red");
    }
}
