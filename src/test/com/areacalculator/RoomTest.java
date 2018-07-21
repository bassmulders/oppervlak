package com.areacalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    private final static String WOONKAMER = "Woonkamer";

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testRoomAreaCalculation(TestValues testValues) {
        assertEquals(testValues.getExpectedSize(), testValues.room.getSize());
        assertEquals(testValues.getExpectedName(), testValues.room.getName());
    }

    private static Stream<TestValues> dataProvider() {
        return Stream.of(
                new TestValues(RoomBuilder.builder(WOONKAMER)
                        .addRectangle(10, 5)
                        .addRightAngledTriangle(10, 5)
                        .build(),
                        75,
                        WOONKAMER),
                new TestValues(RoomBuilder.builder("Balkon")
                        .addRectangle(2, 2)
                        .build(),
                        4,
                        "Balkon"),
                new TestValues(RoomBuilder.builder("Enkele negatieve afmeting")
                        .addRectangle(-2, 2)
                        .build(),
                        0,
                        "Enkele negatieve afmeting"),
                new TestValues(RoomBuilder.builder("Dubbele negatieve afmeting")
                        .addRectangle(-2, -0.2)
                        .build(),
                        0,
                        "Dubbele negatieve afmeting"),
                new TestValues(RoomBuilder.builder("Slaapkamer")
                        .build(),
                        0,
                        "Slaapkamer")
        );
    }

    private static class TestValues {
        private Room room;
        private double expectedSize;
        private String expectedName;

        TestValues(Room room, double expectedArea, String expectedName) {
            this.room = room;
            this.expectedSize = expectedArea;
            this.expectedName = expectedName;
        }

        Room getRoom() {
            return room;
        }

        double getExpectedSize() {
            return expectedSize;
        }

        String getExpectedName() {
            return expectedName;
        }
    }
}