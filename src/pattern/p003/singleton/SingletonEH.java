package pattern.p003.singleton;

public class SingletonEH {
    private static final SingletonEH instance = new SingletonEH();
    private SingletonEH() {
        // TODO Auto-generated constructor stub
        System.out.println("task manager init");
    }
    public static SingletonEH getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("mode : SingletonEH");
        SingletonEH instance1 = SingletonEH.getInstance();
        SingletonEH instance2 = SingletonEH.getInstance();
        SingletonEH instance3 = SingletonEH.getInstance();
        if (instance1 == instance2 && instance2 == instance3) {
            System.out.println("singleton verify success");
        }
    }

}
