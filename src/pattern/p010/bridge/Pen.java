package pattern.p010.bridge;

public class Pen extends Tool {

    public Pen(DrawColorInterface d) {
        super(d);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void drawRed() {
        // TODO Auto-generated method stub
        System.out.print("Pen : ");
        this.d.drawRed();
    }

    @Override
    public void drawGreen() {
        // TODO Auto-generated method stub
        System.out.print("Pen : ");
        this.d.drawGreen();
    }

    @Override
    public void drawBlue() {
        // TODO Auto-generated method stub
        System.out.print("Pen : ");
        this.d.drawBlue();
    }

}
