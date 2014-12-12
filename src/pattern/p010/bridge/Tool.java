package pattern.p010.bridge;

public abstract class Tool {
    protected DrawColorInterface d;
    public Tool(DrawColorInterface d) {
        // TODO Auto-generated constructor stub
        this.d = d;
    }
    
    abstract public void drawRed();
    abstract public void drawGreen();
    abstract public void drawBlue();
}
