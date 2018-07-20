package com.surface;

public class Triangle extends Rectangle {

    Triangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    @Override
    public double surface() {
        return super.surface() * 0.5;
    }
}
