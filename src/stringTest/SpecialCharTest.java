package stringTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName SpecialCharTest
 * @Description TODO
 * @Author renwg
 * @Date 2023/6/9 14:00
 * @Version 1.0
 */
public class SpecialCharTest {
    public static void main(String[] args) {
        String str = "Java&";
        boolean flag = isSpecialChar(str);
        System.out.println("str包含特殊字符：" + flag);
    }

    public static boolean isSpecialChar(String str) {
        String regEx = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.find();
    }
}