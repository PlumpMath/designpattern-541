package pattern.p003.singleton;

public class SingletonLH {
    private static SingletonLH instance = null; 
    private SingletonLH() {
        // TODO Auto-generated constructor stub
        System.out.println("task manager init");
    }
    synchronized public static SingletonLH getInstance() {
        if (instance == null) {
            instance = new SingletonLH();
        }
        return instance;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("mode : SingletonLH");
        SingletonLH instance1 = SingletonLH.getInstance();
        SingletonLH instance2 = SingletonLH.getInstance();
        SingletonLH instance3 = SingletonLH.getInstance();
        if (instance1 == instance2 && instance2 == instance3) {
            System.out.println("singleton verify success");
        }
    }

}
