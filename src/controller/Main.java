package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dabluk on 16/07/15.
 */
public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the Plateau X position");
            int plateauX = Integer.parseInt(br.readLine());
            System.out.println("Enter the Plateau Y position");
            int plateauY = Integer.parseInt(br.readLine());
            System.out.println("How many input you want");
            int number = Integer.parseInt(br.readLine());
            while (number != 0) {
                System.out.println("Enter the position X");
                int positionX = Integer.parseInt(br.readLine());
                System.out.println("Enter the position Y");
                int positionY = Integer.parseInt(br.readLine());
                System.out.println("Enter the direction");
                String direction = br.readLine();
                System.out.println("Enter the input for moving the rover");
                String input = br.readLine();
                MarsRover marsRover = new MarsRover(positionX, positionY, plateauX, plateauY, direction);
                marsRover.moveInPlateau(input);
                System.out.println(marsRover.getPositionX() + " " + marsRover.getPositionY() + " " + marsRover.getDirection());
                number--;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
