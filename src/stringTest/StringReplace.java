package stringTest;

/**
 * @author rwg
 * @date 2021/9/18 14:40
 */
public class StringReplace {
    public static void main(String[] args) {
        String a = "aa-aa-a_a_q_a-q";
        String b = a.replace('-', '+').replace('_', '/');
        String c = "2022.01.08";
        String d = c.replace(".","");
        System.out.println(d);
        System.out.println(b);
        System.out.println();
    }
}
