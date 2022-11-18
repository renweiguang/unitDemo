package stringTest;

public class sssssssssssssssss {
    public static void main(String[] args) {
        String s = "D:\\S1;D:\\S2;D:\\S3";

        String[] sss = s.split(";");

        for (int i = 0; i < sss.length; i++) {
            if (sss[i].contains("S1")) {
                System.out.println(sss[i]);
            }
        }
    }
}
