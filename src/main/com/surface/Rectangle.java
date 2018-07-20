package com.surface;

public class Rectangle extends AbstractShape {
    private double width;
    private double length;

    Rectangle() {
        width = 0;
        length = 0;
    }

    Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    double getLength() {
        return length;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double surface() {
        return width * length;
    }
}
