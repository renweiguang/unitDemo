package ziDingYiTryCatch;

public class TestException {
    public static void main(String[] args) {
        UseMyException useMyException = new UseMyException("rwg", "123");
        try {
            useMyException.throwException("1234");
        } catch (MyException e) {
            e.printStackTrace();
        }

        System.out.println(1111);
    }
}
