package shujujiegou;

/**
 * 希尔排序其实是为了减少插入排序的时间复杂度创建的一种算法，
 * 他设定了一个gap间隔，去对间隔中的值进行排序，然后间隔依次缩小到1为止
 * 主要思想就是插入排序
 */
public class ShellTest {
    public static void main(String[] args) {
        int[] a = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        // 循环gap 4-2-1
        for (int gap = 4; gap > 0; gap = gap / 2) {
            // 从第gap为止开始
            for (int i = gap; i < a.length; i++) {
                // i为几就从几开始，和他减轻gap的位置上的值进行比较。
                for (int j = i; j > gap - 1; j = j - gap) {
                    if (a[j - gap] > a[j]) {
                        int temp = a[j - gap];
                        a[j - gap] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
