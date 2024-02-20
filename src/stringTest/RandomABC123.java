package stringTest;

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author renwg
 * @date 2022/9/29
 */
public class RandomABC123 {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuffer valSb = new StringBuffer();
        String charStr = "0123456789abcdeFGHIJKlmnopqrstuvwxyz";
        int charLength = charStr.length();
        for (int i = 0; i < 16; i++) {
            int index = random.nextInt(charLength);
            valSb.append(charStr.charAt(index));

        }
        System.out.println(valSb.toString());

        String str = "abcdefghij";
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && i != arr.length - 1) {
                arr[i] = "*";
            }
        }
        System.out.println(Joiner.on("").join(arr));
    }
}
