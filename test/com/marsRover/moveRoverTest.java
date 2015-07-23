package com.marsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class moveRoverTest {

    @Test
    public void shouldBeValidPosition() {
        Rover rover = new Rover(0, 0, "N");

        assertEquals("0 0 N", rover.currentPosition());
    }
}
