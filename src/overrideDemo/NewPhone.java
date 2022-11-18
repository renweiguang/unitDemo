package overrideDemo;

public class NewPhone extends Phone
{

    @Override
    public void call(String name)
    {
        System.out.println("开启视频功能");
        // 调用父类的call方法
        super.call("臭宝宝");
    }
}
