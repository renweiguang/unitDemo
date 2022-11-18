package ZhiChuanDiYinYongChuanDi;

/**
 * 可以看出通过方法传递后，int 类型与 String 类型的原值并没有受到前面 test5 方法执行后的影响，还是输出了原值。
 * 这种形为通常被说成值传递。如果原值经过 test5 方法后被改变了，这种形为通常被描述为引用传递。
 */
public class StringBase
{

    public static void main(String[] args)
    {
        int c = 66; //c 叫做实参
        String d = "hello"; //d 叫做实参

        StringBase stringBase = new StringBase();
        stringBase.test5(c, d); // 此处 c 与 d 叫做实参

        System.out.println("c的值是：" + c + " --- d的值是：" + d);
    }

    public void test5(int c, String d)
    { // c 与 d 叫做形参
        c = 55;
        d = "no";
    }
}