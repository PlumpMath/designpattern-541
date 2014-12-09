package pattern.p004.prototype;

public class CloneTest implements Cloneable {
    public String name;
    public String[] phonelist;
    
    public CloneTest() {
        // TODO Auto-generated constructor stub
    }

    public Object clone() {
        CloneTest ct = null;
        try {
            ct = (CloneTest)super.clone();
            ct.phonelist = (String[])phonelist.clone();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ct;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CloneTest ct1 = new CloneTest();
        CloneTest ct2 = new CloneTest();
        ct1.name = "helloworld";
        ct1.phonelist = new String[]{"123","321"};
        
        ct2 = (CloneTest)ct1.clone();
        //ct2 = ct1;
        ct2.name = "HelloWorld";
        ct2.phonelist[1] = "321321";
        
        System.out.println(ct1.name);
        for (int i = 0; i < ct1.phonelist.length; i++) {
            System.out.println(ct1.phonelist[i]);
        }

        System.out.println(ct2.name);
        for (int i = 0; i < ct2.phonelist.length; i++) {
            System.out.println(ct2.phonelist[i]);
        }
    }

}
