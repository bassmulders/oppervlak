package com.areacalculator.building;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RoomTest {

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testRoomAreaCalculation(TestValues testValues) {
        Assertions.assertEquals(testValues.getExpectedSize(), testValues.getRoom().getSize());
        Assertions.assertEquals(testValues.getExpectedName(), testValues.getRoom().getName());
    }

    private static Stream<TestValues> dataProvider() {
        final String WOONKAMER = "Woonkamer";
        final String BALKON = "Balkon";
        final String SLAAPKAMR = "Slaapkamer";
        final String ENKELE_NEGATIEVE_AFMETING = "Enkele negatieve afmeting";
        final String DUBBELE_NEGATIEVE_AFMETING = "Dubbele negatieve afmeting";
        return Stream.of(
                new TestValues(RoomBuilder.builder(WOONKAMER)
                        .addRectangle(10, 5)
                        .addRightAngledTriangle(10, 5)
                        .build(),
                        75,
                        WOONKAMER),
                new TestValues(RoomBuilder.builder(BALKON)
                        .addRectangle(2, 2)
                        .build(),
                        4,
                        BALKON),
                new TestValues(RoomBuilder.builder(ENKELE_NEGATIEVE_AFMETING)
                        .addRectangle(-2, 2)
                        .build(),
                        0,
                        ENKELE_NEGATIEVE_AFMETING),
                new TestValues(RoomBuilder.builder(DUBBELE_NEGATIEVE_AFMETING)
                        .addRectangle(-2, -0.2)
                        .build(),
                        0,
                        DUBBELE_NEGATIEVE_AFMETING),
                new TestValues(RoomBuilder.builder(SLAAPKAMR)
                        .build(),
                        0,
                        SLAAPKAMR)
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