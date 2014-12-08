package pattern.p004.singleton;

public class Singleton {
    private static Singleton tm = null;
    //private static final TaskManager tm = new TaskManager();
    private Singleton() {
        // TODO Auto-generated constructor stub
        System.out.println("task manager init");
    }
    synchronized public static Singleton getInstance() {
        if (tm == null) {
            tm = new Singleton();
        }
        return tm;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Singleton tm1 = Singleton.getInstance();
        Singleton tm2 = Singleton.getInstance();
        Singleton tm3 = Singleton.getInstance();
        if (tm1 == tm2 && tm2== tm3) {
            System.out.println("singleton verify");
        }
    }

}
