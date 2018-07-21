package com.areacalculator;

public abstract class AbstractShape {
    private double width;
    private double length;

    public abstract double getArea();

    double getLength() {
        return length;
    }

    void setLength(double length) {
        if (length < 0) {
            length = 0;
        }
        this.length = length;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }

}
