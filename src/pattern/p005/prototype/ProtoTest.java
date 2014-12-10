package pattern.p005.prototype;

public class ProtoTest {

    public ProtoTest() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringBuilder stra = new StringBuilder("hello world");
        StringBuilder strb = stra;
        System.out.println(stra);
        System.out.println(strb);
        stra.setCharAt(0, 'H');
        System.out.println(stra);
        System.out.println(strb);
        
        String ssa = new String("ABC");
        System.out.println(ssa);
        String ssb = new String("DEF");
        System.out.println(ssb);
    }

}
