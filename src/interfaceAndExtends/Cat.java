package interfaceAndExtends;

public class Cat implements INetTPCardMgr {
    @Override
    public void cat() {
        System.out.println("执行了cat");
    }

    @Override
    public void animal() {
        System.out.println("执行了animal");
    }
}
