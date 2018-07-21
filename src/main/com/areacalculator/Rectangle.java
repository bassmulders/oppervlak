package com.areacalculator;

public class Rectangle extends AbstractShape {

    Rectangle() {
        setWidth(0);
        setLength(0);
    }

    Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }
}
