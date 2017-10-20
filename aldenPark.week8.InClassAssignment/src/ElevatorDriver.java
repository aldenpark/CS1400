/**
 * @filename: ElevatorDriver.java
 * @author: Alden Park & Cody Lay
 * @date: 10/17/2017
 * @description: Week 8 in class Assignment
 */

/**
 * This is a driver for the Elevator Class
 */
import java.util.Scanner;

public class ElevatorDriver {
    
    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        Elevator el = new Elevator();
        String input;
        
        System.out.print("Welcome to Cody's & Alden's Elevator simulator!\n\n");
        do {
            System.out.print("Options: (s)elect a floor, (f)ire alarm, (q)uit\n\n" +
                "Enter s, f, or q ==> ");
            input = stdIn.next().toLowerCase();
            switch(input){
                case "s":
                    el.selectFloor();
                  break;
                case "f":
                    el.fireAlarm();
                  break;
                case "q": // placeholder  so that an eror message isn't displayed
                  break;
                default:
                    System.out.print("Invalid Selection.");
            }
        } while(!"q".equals(input));
        
    } // end main
    
} // end class ElevatorDriver