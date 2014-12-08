package pattern.p001.factory;


public class PackageTest {

    public PackageTest() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final Package[] packages = Package.getPackages();
        /*
         * for (final Package p : packages) {
            String name = p.getName();
            System.out.println(name);
        }
        *
        */
        for (int i = 0; i < packages.length; i++) {
            String name = packages[i].getName();
            System.out.println(name);
        }
    }

}
