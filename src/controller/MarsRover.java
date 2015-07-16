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

    public MarsRover(int X, int Y, int plateauX, int plateauY, String dir) {
        plateauPositionX = plateauY;
        plateauPositionY = plateauX;
        direction = dir;
        positionX = X;
        positionY = Y;
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
            positionY += 1;
        else if (direction.equals("E") && input.equals("M") && positionX < plateauPositionX)
            positionX += 1;
        else if (direction.equals("W") && input.equals("M"))
            positionX += -1;
        else if (direction.equals("S") && input.equals("M"))
            positionY += -1;
    }
    public void moveInPlateau(String input){
        for (int i = 0; i < input.length(); i++) {
            if ( input.charAt(i) == "M".charAt(0)) {
                moveRover("M");
            }
            changeDirection(Character.toString(input.charAt(i)));
        }
    }
}
