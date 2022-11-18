package stringTest;

public class Format
{
    public static void main(String[] args)
    {
        int a = 1;
        String code = String.format("%04d", a);// 变成0001，如果想变成001---“%03d”
        System.out.println(code);

    }
}
