package stringTest;

/**
 * 1、 indexOf(String str): 返回指定字符str在字符串中（方法调用者）第一次出现处的起始索引，
 * 如果此字符串中没有这样的字符，则返回 -1。
 * 2、indexOf(String str, int index): 返回从 index 位置开始查找指定字符str在字符串中第一次出现处的起始索引，
 * 如果此字符串中没有这样的字符，则返回 -1。
 */

public class IndexOfTest {
    public static void main(String[] args) {
        String str = "01234567890123456789";
        System.out.println(str.indexOf("456"));
        System.out.println(str.indexOf("123", 5));

    }
}

/**
 * 上面程序的结果为1和11。第1个输出函数中的indexOf()方法只有一个参数，故返回123在str中第一次出现处的索引，为1；
 * 第1个输出函数中的indexOf()方法有两个参数，第一个参数为要查找的字符串123，
 * 第2个参数为从第5所以位置处开始查找，故只能查找到str中的第2个123，返回其出现的起始索引，为11。
 */
