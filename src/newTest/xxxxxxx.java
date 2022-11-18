package newTest;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class xxxxxxx
{
    public static void main(String[] args) throws IOException
    {
        File file = null;
        BufferedImage image = null;

        try
        {
            file = new File("E:\\in.jpg");
            image = ImageIO.read(file);

            int width = image.getWidth();
            int height = image.getHeight();

            for (int j = 0; j < height; j++)
            {
                int l = 0, r = width - 1;
                while (l < r)
                {
                    int pl = image.getRGB(l, j);
                    int pr = image.getRGB(r, j);

                    image.setRGB(l, j, pr);
                    image.setRGB(r, j, pl);

                    l++;
                    r--;
                }
            }

            file = new File("E:\\out.jpg");
            ImageIO.write(image, "jpg", file);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
