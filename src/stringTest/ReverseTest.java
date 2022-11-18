package stringTest;

import java.util.Scanner;

/**
 * @author renwg
 * @date 2022/11/16
 */
public class ReverseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.nextLine();
        //转换成StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }
}
