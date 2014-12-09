package pattern.p003.singleton;

public class SingletonNew {

    public SingletonNew() {
        // TODO Auto-generated constructor stub
        System.out.println("task manager init");
    }
    private static class HoldInstance {
        private static final SingletonNew instance = new SingletonNew();
    }
    public static SingletonNew getInstance() {
        return HoldInstance.instance;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("mode : SingletonNew");
        SingletonNew instance1 = SingletonNew.getInstance();
        SingletonNew instance2 = SingletonNew.getInstance();
        SingletonNew instance3 = SingletonNew.getInstance();
        if (instance1 == instance2 && instance2 == instance3) {
            System.out.println("singleton verify success");
        }
    }

}
