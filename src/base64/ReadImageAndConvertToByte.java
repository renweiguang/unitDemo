package base64;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.Base64;

public class ReadImageAndConvertToByte
{
    public static void main(String[] args)
    {
        try
        {
            final Base64.Decoder decoder = Base64.getDecoder();
            File file = new File("C:\\Users\\rwg\\Desktop\\Face_FRONT_01.png");
            byte[] fileByte = Files.readAllBytes(file.toPath());
            byte[] aaa3aa = decoder.decode(fileByte);

            FileOutputStream out = new FileOutputStream("C:\\Users\\rwg\\Desktop\\Face_FRONT_02.png");
            out.write(aaa3aa);
            out.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
