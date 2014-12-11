package pattern.p007.decorator;

public class Decorator implements InterfaceA {
    private InterfaceA a;
    public Decorator(InterfaceA a) {
        // TODO Auto-generated constructor stub
        this.a = a;
    }

    @Override
    public void method() {
        // TODO Auto-generated method stub
        System.out.println("msg : before method execute");
        this.a.method();
        System.out.println("msg : after method execute");
    }

}
