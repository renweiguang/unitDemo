package OverrideEquals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author rwg
 * @date 2021/10/27 20:00
 */
public class SetTest1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("abc");
        set.add("xyz");
        set.add("abc");


        for (Iterator<String> iter = set.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());

        }

    }


}
