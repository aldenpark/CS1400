/**
 * @filename: ElevatorDriver.java
 * @author: Alden Park & -----------
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
        char input;
        
        System.out.print("Welcome to -----  & Alden's Elevator simulator!\n\n");
        do {
            System.out.print("Options: (s)elect a floor, (f)ire alarm, (q)uit\n\n" +
                "Enter s, f, or q ==> ");
            input = stdIn.next().charAt(0);
            switch(input){
                case 's':
                    el.selectFloor();
                  break;
                case 'f':
                    el.fireAlarm();
                  break;
                case 'q': // placeholder  so that an eror message isn't displayed
                  break;
                default:
                    System.out.print("Invalid Selection.");
            }
        } while(input != 'q');
        
    } // end main
    
} // end class ElevatorDriver