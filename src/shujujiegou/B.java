package shujujiegou;

/**
 * 如何将一个数组拆分成两个数组
 */
public class B {
    public static void main(String[] args) {
        int[] c = new int[]{1, 2, 3, 4, 5, 6};
        int indenx = c.length / 2;
        int[] a = new int[indenx];
        int[] b = new int[indenx];

        for (int i = 0; i < indenx; i++) {
            a[i] = c[i];
            System.out.println(a[i]);
        }
        for (int j = 0; j < indenx; j++) {
            b[j] = c[j + indenx];
            System.out.println(b[j]);
        }
    }
}