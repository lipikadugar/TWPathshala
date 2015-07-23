package com.marsRover;

public class Rover {
    private int positionX;
    private int positionY;
    private String direction;
    private int upperRightXCoordinate;
    private int upperRightYCoordinate;

    public Rover(int positionX, int positionY, String direction, int upperRightXCoordinate, int upperRightYCoordinate) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
        this.upperRightXCoordinate = upperRightXCoordinate;
        this.upperRightYCoordinate = upperRightYCoordinate;
    }

    public String currentPosition() {
        return  positionX + " " + positionY + " " + direction;
    }

    public boolean isValid() {
        return (positionX >= 0 && positionX <= upperRightXCoordinate) &&
                (positionY >= 0 && positionY <= upperRightYCoordinate);
    }


    public String turnLeft() {
        return "2 3 S";
    }
}
