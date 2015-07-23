package com.marsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class moveRoverTest {

    @Test
    public void shouldBeRoverCurrentPosition() {
        Rover rover = new Rover(0, 0, "N", 5, 5);

        assertEquals("0 0 N", rover.currentPosition());
    }

    @Test
    public void shouldPositionBeWithinRectangularArea() {
        Rover currentPosition = new Rover(2, 3, "W", 5, 5);

        assertEquals(true, currentPosition.isValid());
    }

    @Test
    public void shouldPositionBeInValidOutsidePlateau() {
        Rover currentPosition = new Rover(6, 3, "W", 5, 5);

        assertEquals(false, currentPosition.isValid());
    }

    @Test
    public void shouldPositionBeInvalidForNegativePosition() {
        Rover currentPosition = new Rover(5, -8, "W", 5, 5);

        assertEquals(false, currentPosition.isValid());
    }
}
