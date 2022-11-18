package reflect;

import javax.jnlp.ClipboardService;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Monkey
{
    private void a()
    {

    }

    private void b()
    {

    }
}

public class RefectDemo
{
    public static void main(String[] args) throws NoSuchMethodException
    {
        Class<Monkey> monkeyClass = Monkey.class;
        Method[] declaredMethods = monkeyClass.getDeclaredMethods();
        // 将数组变成list
        List<Method> methods = Arrays.asList(declaredMethods);
        methods.stream().forEach(r -> System.out.println(r.getName()));
    }
}
