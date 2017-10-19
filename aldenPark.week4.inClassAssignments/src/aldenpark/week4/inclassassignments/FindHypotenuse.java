package aldenpark.week4.inclassassignments;
import java.util.Scanner;

/**
 * @filename: FindHypotenuse.java
 * @author: Alden Park
 * @date: 9/19/2017
 * @description: Week 4 in class Assignment
 */

public class FindHypotenuse {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double base;
        double height;
        double hypotenuse;
        
        System.out.print("Enter right triangle base: ");
        base = stdIn.nextDouble();
        System.out.print("Enter right triangle height: ");
        height = stdIn.nextDouble();
        
        hypotenuse = Math.sqrt(base * base + height * height);
        
        System.out.println("Hypotenuse length = " + hypotenuse);
        
    } // end main
    
} // end FindHypotenuse class
