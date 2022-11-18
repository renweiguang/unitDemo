package testDemoooo;

public class LamdaTest
{
    public static void main(String[] args)
    {

        // 匿名内部类
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("hello world");
            }
        }).start();

        /**
         * lamda表达式
         */
        new Thread(() -> System.out.println("hello world")).start();
    }
}
