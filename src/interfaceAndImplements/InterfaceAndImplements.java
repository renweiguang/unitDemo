package interfaceAndImplements;

public class InterfaceAndImplements {
    public static void main(String[] args) {

        InterfaceTest a = new AImpl();
        InterfaceTest b = new BImpl();
        InterfaceTest c = new CImpl();

        ((AImpl) a).toPrint2();
        a.toPrint();
        b.toPrint();
        c.toPrint();
    }
}

interface InterfaceTest {

    public void toPrint();

}

class AImpl implements InterfaceTest {

    public void toPrint() {
        System.out.println("A toPrint function()");
    }

    public void toPrint2() {
        System.out.println("A toPrint2 function()");
    }

}

class BImpl implements InterfaceTest {

    public void toPrint() {
        System.out.println("B toPrint function()");
    }

}

class CImpl implements InterfaceTest {
    public void toPrint() {
        System.out.println("C toPrint function()");
    }
}
