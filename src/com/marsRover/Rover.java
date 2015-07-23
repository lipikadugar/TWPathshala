package com.marsRover;

public class Rover {
    private int positionX;
    private int positionY;
    private String direction;

    public Rover(int positionX, int positionY, String direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    public String currentPosition() {
        return  positionX + " " + positionY + " " + direction;
    }
}
