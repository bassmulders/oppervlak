package com.areacalculator.building;

import com.areacalculator.shapes.AbstractShape;
import com.areacalculator.shapes.Rectangle;
import com.areacalculator.shapes.RightAngledTriangle;

import java.util.ArrayList;

class Room {
    private String name;
    private ArrayList<AbstractShape> areas;

    Room(String name) {
        this.name = name;
        areas = new ArrayList<>();
    }

    double getSize() {
        return areas.stream().mapToDouble(AbstractShape::getArea).sum();
    }

    String getName() {
        return this.name;
    }

    private void addArea(AbstractShape area) {
        areas.add(area);
    }

    void addRectangle(double width, double length) {
        addArea(new Rectangle(width, length));
    }

    void addRightAngledTriangle(double width, double length) {
        addArea(new RightAngledTriangle(width, length));
    }
}
