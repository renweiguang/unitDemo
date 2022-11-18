package tryCatch;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                list.get(0);

                if (i == 2) {
                    try {
                        list.get(0);
                        System.out.println(111);
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println(33);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(11111);
        }
        System.out.println("156165");
    }
}
