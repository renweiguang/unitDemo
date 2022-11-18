package ziDingYiTryCatch;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(111);
            try {
                for (int i = 0; i < 5; i++) {
                    if (i == 2) {
                        throw new Exception("里面异常来了");
                    }
                    System.out.println(i);
                }
            } catch (Exception e) {
                System.out.println("里面抓住异常");
            }

        } catch (Exception e) {
            System.out.println("外层抓住异常");
        }
        System.out.println(111111111);
    }
}
