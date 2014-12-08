package pattern.p002.abstractfactory;

public class App {

    public App() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Factory f = new MailFactory();
        Sender s = f.creator();
        s.send();
        
        Factory ff = new MsgFactory();
        Sender ss = ff.creator();
        ss.send();
    }

}
