package com.areacalculator.shapes;

public class RightAngledTriangle extends Rectangle {

    public RightAngledTriangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    @Override
    public double getArea() {
        return super.getArea() * 0.5;
    }
}
