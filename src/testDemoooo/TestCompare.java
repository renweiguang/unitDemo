package testDemoooo;

import java.util.Comparator;

public class TestCompare
{
    public static void main(String[] args)
    {

        // 匿名内部类 需要重写类里的方法
        // 其实相当于是个接口。你要去重写接口的方法
        // 匿名内部类就是继承你想掉的那个方法的类，然后通过匿名内部类去调用
        Comparator comparator = new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare("a", "b"));
    }
}
