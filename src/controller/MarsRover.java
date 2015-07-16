package controller;

/**
 * Created by dabluk on 16/07/15.
 */
public class MarsRover {
    private int positionX;
    private int positionY;
    private int plateauPositionX;
    private int plateauPositionY;
    private String direction;

    public MarsRover(int X, int Y, int plateauPositionX, int plateauPositionY, String direction) {
        this.plateauPositionX = plateauPositionX;
        this.plateauPositionY = plateauPositionY;
        this.direction = direction;
        this.positionX = X;
        this.positionY = Y;
    }

    public String getDirection(){
        return direction;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void changeDirection(String input) {
        if (direction.equals("N") && input.equals("L"))
            direction = "W";
        else if (direction.equals("N") && input.equals("R"))
            direction = "E";
        else if (direction.equals("E") && input.equals("L"))
            direction = "N";
        else if (direction.equals("E") && input.equals("R"))
            direction = "S";
        else if (direction.equals("S") && input.equals("L"))
            direction = "E";
        else if (direction.equals("S") && input.equals("R"))
            direction = "W";
        else if (direction.equals("W") && input.equals("L"))
            direction = "S";
        else if (direction.equals("W") && input.equals("R"))
            direction = "N";
    }

    public void moveRover(String input) {

        if (direction.equals("N") && input.equals("M") && positionY < plateauPositionY)
            this.positionY += 1;
        else if (direction.equals("E") && input.equals("M") && positionX < plateauPositionX)
            this.positionX += 1;
        else if (direction.equals("W") && input.equals("M"))
            this.positionX += -1;
        else if (direction.equals("S") && input.equals("M"))
            this.positionY += -1;
    }
}
