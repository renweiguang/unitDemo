package stringTest;

public class Special {
    public static void main(String[] args) {
//        String fileName = "D:\\fff\\R       999999992018080001_1760607.fptx";
//        String a = fileName.substring(fileName.indexOf("_")+1,fileName.indexOf("."));
//        System.out.println(a);
        String personNum = "R1561561561561";
        if (personNum.substring(0, 1).equals("R")) {
            System.out.println(personNum.substring(1));
        }
    }
}

