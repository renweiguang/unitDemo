package testDemoooo;

/**
 * trim(）方法能够截取掉字符串前后的空格
 */
public class TestTrim {
    public static void main(String[] args) {
        String name = " jack ";
        System.out.println("字符串原本的长度" + name.length());
        name = name.trim();
        System.out.println("trim之后的长度" + name.length());
    }
}
