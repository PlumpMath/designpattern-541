package pattern.p006.adapter;

public class App {

    public App() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Target t = new Adapter();
        t.method1();t.method2();
    }

}
