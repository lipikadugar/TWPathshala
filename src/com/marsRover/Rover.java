package com.marsRover;

import java.util.Objects;

public class Rover {
    private int positionX;
    private int positionY;
    private String direction;
    private int upperRightXCoordinate;
    private int upperRightYCoordinate;
    private String move;
    String map[] = {"N","W","S","E"};

    public Rover(int positionX, int positionY, String direction, int upperRightXCoordinate, int upperRightYCoordinate, String move) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
        this.upperRightXCoordinate = upperRightXCoordinate;
        this.upperRightYCoordinate = upperRightYCoordinate;
        this.move = move;
    }

    public String currentPosition() {
        return  positionX + " " + positionY + " " + direction;
    }

    public boolean isValid() {
        return (positionX >= 0 && positionX <= upperRightXCoordinate) &&
                (positionY >= 0 && positionY <= upperRightYCoordinate);
    }


    public String move() {
        int i;
        for (i = 0; i<4; i++)
            if (Objects.equals(map[i], direction))
                break;
        if (Objects.equals(move, "L"))
        {
            i++;
            if (i > 3) i = 0;
        }
        else if (Objects.equals(move, "R"))
        {
            i--;
            if (i < 0) i = 3;
        }
        else if (Objects.equals(move, "M"))
        {
            if (i == 0) positionY++;
            if (i == 1) positionX--;
            if (i == 2) positionY--;
            if (i == 3) positionX++;
        }
        return positionX + " " + positionY + " " + map[i];
    }
}
