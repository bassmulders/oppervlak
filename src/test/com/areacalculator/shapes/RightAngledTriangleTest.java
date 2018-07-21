package com.areacalculator.shapes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RightAngledTriangleTest {

    @ParameterizedTest
    @MethodSource("valueProvider")
    void testAreaCalculation(TestValues testValues) {
        RightAngledTriangle triangle = new RightAngledTriangle(testValues.getWidth(), testValues.getLength());
        assertEquals(testValues.getExpected(), triangle.getArea());
    }

    private static Stream<TestValues> valueProvider() {
        return Stream.of(
                new TestValues(5, 7, 17.5),
                new TestValues(0, 7, 0),
                new TestValues(5, 0, 0),
                new TestValues(100, 300, 15000),
                new TestValues(3728, 7, 13048)
        );
    }

    private static class TestValues {
        private double width;
        private double length;
        private double expected;

        TestValues(double width, double length, double expected) {
            this.width = width;
            this.length = length;
            this.expected = expected;
        }

        double getWidth() {
            return width;
        }

        double getLength() {
            return length;
        }

        double getExpected() {
            return expected;
        }
    }

}