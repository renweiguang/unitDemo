package testDemoooo;

public class TestMirror
{
    public static void main(String[] args)
    {
        byte[] arr = new byte[512];
        for (int i = 0; i < arr.length; i++)
        {
            byte temp = arr[i];
            arr[511 - i] = temp;
            arr[i] = arr[511 - i];
        }
    }
}
