package pattern.p005.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialCopy implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String[] phonelist;
    
    public SerialCopy(String name, int age, String[] phonelist) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.age = age;
        this.phonelist = phonelist;
    }
    
    public void getInfo() {
        System.out.println("name      : " + this.name);
        System.out.println("age       : " + this.age);
        System.out.print("phonelist : ");
        for (int i = 0; i < this.phonelist.length; i++) {
            System.out.print(this.phonelist[i] + ",");
        }
        System.out.println();
    }
    
    public SerialCopy deepCopy() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (SerialCopy) ois.readObject();
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SerialCopy s1 = new SerialCopy("junneyang", 25, new String[]{"123","321"});
        SerialCopy s2 = s1;
        System.out.println(s1 == s2);
        s1.getInfo();
        s2.getInfo();
        
        System.out.println("\n**************************");
        try {
            SerialCopy s3 = s1.deepCopy();
            System.out.println(s1 == s3);
            s1.getInfo();
            s3.getInfo();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
