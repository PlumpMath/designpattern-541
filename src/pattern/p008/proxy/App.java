package pattern.p008.proxy;

public class App {

    public App() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InterfaceA a = new Proxy();
        a.method();
    }

}
