package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDemo02
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(7);
        al.add(5);
        for (int n : al)
            System.out.print(n + " ");
        System.out.println();
        System.out.println("-----------------");
        Collections.sort(al, new Comparator<Object>()
        {
            @Override
            public int compare(Object o1, Object o2)
            {
                return ((int) o1) - ((int) o2);// o1 - o2 升序，反之降序
            }
        });
        for (int n : al)
            System.out.print(n + " ");
    }
}
