package shujujiegou;

import java.util.ArrayList;
import java.util.List;

public class FindK {
    /**
     * 查找数组arr中第k大/小的奇数,如果不存在则返回0
     *
     * @param arr
     * @param k
     * @return
     */
    public static int findKth(int[] arr, int k) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
//        //获取排序后的奇数集合
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 1) {
//                list.add(arr[i]);
//            }
//        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        //取值
        try {
            return list.get(k - 1);
        } catch (Exception e) {
            return 0;
        }
    }
}
