package pattern.p009.facade;

public class Facade {
    private A a;
    private B b;
    private C c;
    
    public Facade() {
        // TODO Auto-generated constructor stub
        this.a = new A();
        this.b = new B();
        this.c = new C();
    }
    
    public void method1() {
        this.a.func();
        this.b.func();
    }
    public void method2() {
        this.a.func();
        this.b.func();
        this.c.func();
    }

}
