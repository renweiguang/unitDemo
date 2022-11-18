package testDemoooo;

public class ExcessTest {
    int i = 1;

    public boolean compare() {
        return i == 1;
    }

    public static void main(String[] args) {
        boolean stop = false;
        ExcessTest excessTest = new ExcessTest();
        System.out.println(excessTest.compare());
        System.out.println(!stop);
    }
}
