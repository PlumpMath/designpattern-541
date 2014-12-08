package pattern.p001.factory;


public class App {

    public App() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String classname = args[0];
        Factory f = new Factory();
        Sender s = null;
        try {
            s = f.creator(classname);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return;
        }
        s.send();
    }

}
