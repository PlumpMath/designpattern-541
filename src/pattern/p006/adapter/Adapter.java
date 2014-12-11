package pattern.p006.adapter;

public class Adapter extends AAA implements Target {

    public Adapter() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        System.out.println("method : Target.method2");
    }

}
