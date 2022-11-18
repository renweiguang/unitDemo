package stringTest;

public class ByteDem {

    public static void main(String[] args) {

        String str = "{\"streamId\":\"2114_82201_ef60f24e-52ea-4635-9a61-510740b2b305\",\"eventType\":\"1\",\"liveId\":\"82201\"}";
        byte[] s = strToByteArray(str);
        for (byte b : s) {
            System.out.println(b);
        }
        String name = new String(s);
        System.out.println(name);
    }

    public static byte[] strToByteArray(String str) {
        if (str == null) {
            return null;
        }
        byte[] byteArray = str.getBytes();
        return byteArray;
    }
}
