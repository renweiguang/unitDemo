package shujujiegou;

/**
 * 插入排序
 * 插入排序就是拿到的第j张牌，往前插入找到（左边比j小，右边比j大）的位置插入进去
 */
public class ChaRuPaiXu {
    public static void main(String[] args) {
        int[] arr = {14, 31, 1, 5, 4, -3, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
