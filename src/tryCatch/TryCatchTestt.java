package tryCatch;

public class TryCatchTestt {
    public static void main(String[] args) {
        try {
            System.out.println("aaa");
            throw new Exception("参数越界");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(1);
        }
        System.out.println("异常后");// 可以执行
    }
}
