package file;

import java.io.File;

public class FileTest
{
    public static void main(String[] args)
    {
        File file = new File("E:/test/0930");
        file.mkdirs();
    }
}
