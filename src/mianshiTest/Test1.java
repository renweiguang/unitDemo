package mianshiTest;

/**
 * @author rwg
 * @date 2021/11/18 10:10
 */
public class Test1 {
    public static void main(String[] args) {
        String str1 ="abc";
        String str2 ="abc";
        System.out.println(str2==str1);
        System.out.println(str2.equals(str1));
        String str3 =new String("abc");
        String str4 =new String("abc");
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
    }
}
