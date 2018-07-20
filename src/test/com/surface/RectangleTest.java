package com.surface;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private final int WIDTH = 5;
    private final int LENGTH = 7;
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(WIDTH, LENGTH);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSurface() {
        assertEquals((double) WIDTH * LENGTH, rectangle.surface());
    }
}