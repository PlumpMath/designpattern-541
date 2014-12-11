package pattern.p008.proxy;

public class Proxy implements InterfaceA {
    InterfaceA a;
    public Proxy() {
        // TODO Auto-generated constructor stub
        this.a = new A();
    }

    @Override
    public void method() {
        // TODO Auto-generated method stub
        System.out.println("msg : before method execute(proxy)");
        this.a.method();
        System.out.println("msg : after method execute(proxy)");
    }

}
