package com.areacalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @ParameterizedTest
    @MethodSource("valueProvider")
    void testAreaCalculation(TestValues testValues) {
        Rectangle rectangle = new Rectangle(testValues.getWidth(), testValues.getLength());
        assertEquals(testValues.getExpectedArea(), rectangle.getArea());
    }

    private static Stream<TestValues> valueProvider() {
        return Stream.of(
                new TestValues(5, 7, 35),
                new TestValues(0, 7, 0),
                new TestValues(5, 0, 0),
                new TestValues(100, 300, 30000),
                new TestValues(3728, 7, 26096)
        );
    }

    private static class TestValues {
        private double width;
        private double length;
        private double expectedSize;

        TestValues(double width, double length, double expectedArea) {
            this.width = width;
            this.length = length;
            this.expectedSize = expectedArea;
        }

        double getWidth() {
            return width;
        }

        double getLength() {
            return length;
        }

        double getExpectedArea() {
            return expectedSize;
        }

    }

}