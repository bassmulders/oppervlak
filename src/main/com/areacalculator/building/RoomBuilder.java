package com.areacalculator.building;

class RoomBuilder {

    private Room room;

    private RoomBuilder(String name) {
        this.room = new Room(name);
    }

    static RoomBuilder builder(String name) {
        return new RoomBuilder(name);
    }

    Room build() {
        return this.room;
    }

    RoomBuilder addRectangle(double width, double length) {
        room.addRectangle(width, length);
        return this;
    }

    RoomBuilder addRightAngledTriangle(double width, double length) {
        room.addRightAngledTriangle(width, length);
        return this;
    }
}
