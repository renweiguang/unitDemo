package stream;

import java.util.ArrayList;
import java.util.List;

public class ListContainsTest
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(2);
        list1.add(2);
        if (list.containsAll(list1) && list1.containsAll(list))
        {
            System.out.println(111);
        }
        else
        {
            System.out.println(222);
        }
    }
}
