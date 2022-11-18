package testDemoooo;

import java.io.StringReader;

public class StringInputFile {
    public static String read(String content) throws Exception {
        StringReader in = new StringReader(content);
        int s;
        String sb = "";
        while ((s = in.read()) != -1) {
            sb += (char) s;
        }
        in.close();
        return sb;
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        System.out.println(read("我是蒋辉文！你是谁呢？"));
    }
}
