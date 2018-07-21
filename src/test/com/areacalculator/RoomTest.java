package com.areacalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testRoomAreaCalculation(TestValues testValues) {
        assertEquals(testValues.getExpectedSize(), testValues.room.getSize());
    }

    private static Stream<TestValues> dataProvider() {
        return Stream.of(
                new TestValues(RoomBuilder.builder("Woonkamer")
                        .addRectangle(10, 5)
                        .addRightAngledTriangle(10, 5)
                        .build(),
                        75),
                new TestValues(RoomBuilder.builder("Balkon")
                        .addRectangle(2, 2)
                        .build(),
                        4),
                new TestValues(RoomBuilder.builder("Enkele negatieve afmeting")
                        .addRectangle(-2, 2)
                        .build(),
                        0),
                new TestValues(RoomBuilder.builder("Dubbele negatieve afmeting")
                        .addRectangle(-2, -0.2)
                        .build(),
                        0),
                new TestValues(RoomBuilder.builder("Slaapkamer")
                        .build(),
                        0)
        );
    }

    private static class TestValues {
        private Room room;
        private double expectedSize;

        TestValues(Room room, double expectedArea) {
            this.room = room;
            this.expectedSize = expectedArea;
        }

        Room getRoom() {
            return room;
        }

        double getExpectedSize() {
            return expectedSize;
        }
    }
}