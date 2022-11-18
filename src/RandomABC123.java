import java.util.Random;

/**
 * @author renwg
 * @date 2022/9/29
 */
public class RandomABC123 {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuffer valSb = new StringBuffer();
        String charStr = "0123456789abcdefghijklmnopqrstuvwxyz";
        int charLength = charStr.length();
        for (int i = 0; i < 16; i++) {
            int index = random.nextInt(charLength);
            valSb.append(charStr.charAt(index));

        }
        System.out.println(valSb.toString());
    }
}
