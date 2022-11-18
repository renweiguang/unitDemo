package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args)
    {

                List<List<String>> fatherList = new ArrayList<>();

                List<String> childList = new ArrayList<>();

                childList.add("before add child list");

                fatherList.add(childList);

                childList.add("after add child list");

//                System.out.println(childList);

                System.out.println(fatherList);

//                childList.forEach(r -> System.out.println(r));
//
//                fatherList.forEach(r -> System.out.println(r));

//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//
//        ListDemo listDemo = new ListDemo();
//        listDemo.dowork(list);

    }

//    public <T> void dowork(List<T> list)
//    {
//        for (Object a : list)
//        {
//            if(a instanceof Integer)
//            {
//                System.out.println(a);
//            }
//        }
//
//    }

}
