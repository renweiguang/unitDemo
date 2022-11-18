package stringTest;

public class ConClude {
    public static void main(String[] args) {
        String temp = "R37021116_00002020080030.fptx";

        String isContained = "_";

        int n = temp.indexOf(isContained);

        System.out.println(n);
    }
}
