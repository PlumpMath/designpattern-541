package pattern.p010.bridge;

public class Brush extends Tool {

    public Brush(DrawColorInterface d) {
        super(d);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void drawRed() {
        // TODO Auto-generated method stub
        System.out.print("Brush : ");
        this.d.drawRed();
    }

    @Override
    public void drawGreen() {
        // TODO Auto-generated method stub
        System.out.print("Brush : ");
        this.d.drawGreen();
    }

    @Override
    public void drawBlue() {
        // TODO Auto-generated method stub
        System.out.print("Brush : ");
        this.d.drawBlue();
    }

}
