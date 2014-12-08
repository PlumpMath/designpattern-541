package pattern.p001.factory;

public class Factory {

    public Factory() {
        // TODO Auto-generated constructor stub
    }
    
    public Sender creator(String classname) throws Exception {
        Sender s = null;
        final Package[] packages = Package.getPackages();
        Class<?> cls = null;
        for (Package p : packages) {
            final String pname = p.getName();
            final String name = pname + "." + classname;
            try {
                cls = Class.forName(name);
            } catch (Exception e) {
                // TODO: handle exception
                continue;
            }
            break;
        }
        try {
            s = (Sender)cls.newInstance();
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception(e);
        }
        return s;
        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
