package testDemoooo;

import java.util.ArrayList;
import java.util.List;

public class SubStringTest {
    public static void main(String args[]) {
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        // a.add("4401031400002016070001");
        // a.add("4401035700002015110014");
        // a.add("4401035700002015110099");
        //
        // b.add("4401035700002015110099");
        // b.add("4401035700002015110014");
        // b.add("4401031400002016070001");

        if (a.containsAll(b) && b.containsAll(a)) {
            System.out.println("111111111");
        } else {
            System.out.println("bbbbbbb");
        }
    }
}
