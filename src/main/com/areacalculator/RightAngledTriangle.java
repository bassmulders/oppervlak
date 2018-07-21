package com.areacalculator;

public class RightAngledTriangle extends Rectangle {

    RightAngledTriangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    @Override
    public double getArea() {
        return super.getArea() * 0.5;
    }
}
