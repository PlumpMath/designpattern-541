package pattern.p001.singleton;


public class SingletonNew {

    private SingletonNew() {
        // TODO Auto-generated constructor stub
        System.out.println("task manager init");
    }
    private static class InstanceClass {
        private static final SingletonNew instance = new SingletonNew();
    }
    public static SingletonNew getInstance(){
        return InstanceClass.instance;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SingletonNew tm1 = SingletonNew.getInstance();
        SingletonNew tm2 = SingletonNew.getInstance();
        SingletonNew tm3 = SingletonNew.getInstance();
        if (tm1 == tm2 && tm2== tm3) {
            System.out.println("singleton verify");
        }
    }

}
