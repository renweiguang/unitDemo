package mianshiTest;

/**
 * @author rwg
 * @date 2021/11/18 10:03
 */
public class forTest {
    public static void main(String[] args) throws Throwable {
        int j = 0;
        for (int i = 0; i < 1000; i++) {
            j = j++;
        }
        System.out.println(j);
    }
}
