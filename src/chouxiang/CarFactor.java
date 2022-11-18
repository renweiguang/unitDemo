package chouxiang;

public class CarFactor
{

    public static Car carFactor(Class<?> tClass)
    {
        if ((tClass.getName()).equals(BMW.class.getName()))
        {
            return new BMW();
        }
        else
        {
            return new BYD();
        }
    }

}
