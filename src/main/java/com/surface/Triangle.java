package java.com.surface;

public class Triangle extends Rectangle {

    @Override
    public double surface() {
        return super.surface() * 0.5;
    }
}
