package danlimoshi;

/**
 * 懒汉模式
 */
public class Singleton2 {
    //    private static Singleton2 singleton2;
    //
    //    private Singleton2()
    //    {
    //    }
    //    public static Singleton2 getInstance()
    //    {
    //        if (singleton2 == null)
    //        {
    //            singleton2 = new Singleton2();
    //        }
    //        return singleton2;
    //    }

    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    public static void main(String[] args) {
        System.out.println(Singleton2.getInstance());
    }
}
