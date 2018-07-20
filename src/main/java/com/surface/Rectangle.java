package java.com.surface;

public class Rectangle extends AbstractShape {
    private int width;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double surface() {
        return width * length;
    }
}
