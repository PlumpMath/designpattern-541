package pattern.p002.factory;

public class Factory {

    public Factory() {
        // TODO Auto-generated constructor stub
    }
    
    public static Sample creator(String classname) throws Exception {
        Sample sample = null;
        final Package[] packages = Package.getPackages();
        Class<?> cls = null;
        
        try {
            for (final Package p : packages) {
                final String pack = p.getName();
                final String tentative = pack + "." + classname;
                try {
                    cls = Class.forName(tentative);
                } catch (final ClassNotFoundException e) {
                    continue;
                }
                break;
            }
            sample = (Sample)cls.newInstance();
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            throw new Exception(e);
        }
        return sample;
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String classname = args[0];
        try {
            Sample s = Factory.creator(classname);
            s.disinfo();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }

}
