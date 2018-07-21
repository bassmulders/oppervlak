package com.areacalculator.shapes;

public class Rectangle extends AbstractShape {

    Rectangle() {
        setWidth(0);
        setLength(0);
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }
}
