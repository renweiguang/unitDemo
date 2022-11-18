package testDemoooo;

/**
 * ==比较的是内存地址由于name2是new 的所以和name1的内部地址肯定不同所以false
 * .equals比较的值，随意相同。
 */

public class TestDengYuAndEquals
{
    public static void main(String[] args)
    {
        String name1 = "tom";
        String name2 = new String("tom");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        // 获取计算机是几核的
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
