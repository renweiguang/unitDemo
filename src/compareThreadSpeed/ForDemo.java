package compareThreadSpeed;

/**
 * 程序不启动线程就相当于单线程(主线程串行工作)。
 */
public class ForDemo {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        double end = System.currentTimeMillis();
        System.out.println("一共运行了" + (end - start) + "毫秒");
    }
}
