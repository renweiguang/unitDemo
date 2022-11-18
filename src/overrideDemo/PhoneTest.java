package overrideDemo;

public class PhoneTest
{
    public static void main(String[] args)
    {
        Phone p = new Phone();
        p.call("臭宝");
        System.out.println("-------------------------");
        NewPhone np = new NewPhone();
        np.call("臭宝");
    }
}
