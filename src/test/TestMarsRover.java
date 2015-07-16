package test;

import controller.MarsRover;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dabluk on 16/07/15.
 */
public class TestMarsRover {
    private MarsRover marsRover;
    private int plateauPositionX = 5;
    private int plateauPositionY = 5;
    private String direction = "N";

    @Before
    public void setup(){
        marsRover = new MarsRover(1,1, plateauPositionX, plateauPositionY, direction);
    }

    @Test
    public void testShouldGiveDirection() {
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void testShouldMoveTheRover() {
        marsRover.moveRover("M");
        int positionY = 2;
        assertEquals(positionY,marsRover.getPositionY());
    }

    @Test
    public void testShouldMoveTheRoverAndCheckThePosition() {
        marsRover = new MarsRover(1,1, plateauPositionX, plateauPositionY, "E");
        marsRover.moveRover("M");
        int positionX = 2;
        assertEquals(positionX,marsRover.getPositionX());
    }

    @Test
    public void testShouldReturnLastPointWhenRoverOutsidePlateau(){
        marsRover = new MarsRover(5,5, plateauPositionX, plateauPositionY,direction);
        marsRover.moveRover("M");
        assertEquals(5,marsRover.getPositionX());
    }
    @Test
    public void testShouldGiveDirectionAfterMoving(){
        marsRover.changeDirection("L");
        assertEquals("W",marsRover.getDirection());
    }
    @Test
    public void testShouldGiveAppropiateDirectionAfterMoving(){
        marsRover.changeDirection("L");
        assertEquals("W",marsRover.getDirection());
    }

    @Test
    public void testShouldGiveProperOutputForMovingRover(){
        marsRover = new MarsRover(1,2,plateauPositionX,plateauPositionY,direction);
        String input = "LMLMLMLMM";

        marsRover.moveInPlateau(input);
        assertEquals(1,marsRover.getPositionX());
        assertEquals(3,marsRover.getPositionY());
        assertEquals("N",marsRover.getDirection());
    }

}
