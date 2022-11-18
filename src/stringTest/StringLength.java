package stringTest;

public class StringLength {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        String a = "BA45070419120039";
        if (a.length() == 15) {
            s.append("R").append(a.substring(0, 6)).append("000000").append(a.substring(5, 15));
            String abc = s.toString();
            System.out.println(abc);
        } else if (a.length() == 16) {
            s.append("R").append(a.substring(0, 6)).append("000000").append(a.substring(6, 16));
            String abc = s.toString();
            System.out.println(abc);
        } else if (a.length() == 22) {
            s.append("R").append(a);
            String abc = s.toString();
            System.out.println(abc);
        }
    }
}
