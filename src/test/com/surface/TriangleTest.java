package com.surface;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleTest {

    private final double WIDTH = 5;
    private final double LENGTH = 7;
    private Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle(WIDTH, LENGTH);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSurface() {
        assertEquals(WIDTH * LENGTH / 2, triangle.surface());
    }
}