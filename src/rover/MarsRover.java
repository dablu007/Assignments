package rover;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dabluk on 16/07/15.
 */
public class MarsRover {
    private int positionX;
    private int positionY;
    private int plateauPositionX;
    private int plateauPositionY;
    private String direction;
    private static final List<String> DIRECTIONS = Arrays.asList("N", "E", "S", "W");
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
        int value;
        if (input.equals("L"))
            value = 1;
        value = 3;
        turnDirection(value);

    }
    public void turnDirection(int value){
        direction = DIRECTIONS.get((DIRECTIONS.indexOf(direction) + value) % DIRECTIONS.size());
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
            else
                changeDirection(Character.toString(input.charAt(i)));
        }
    }
}
