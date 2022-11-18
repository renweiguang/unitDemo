package longAndlong;

public class LongAndlong {

    public static void main(String[] args) {
        Long a = new Long(15);

        Long b = 1L;

        if (a.longValue() > b.longValue()) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
