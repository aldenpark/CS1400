package chapter3;
import java.util.Scanner;

/**
 * Filename: ComputeArea.java
 * Author: Alden Park
 * Date: 9/5/2017
 * Description: Compute Area of Circle and print result
 */

public class ComputeArea {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        double radius;
        final double PI = 3.14159;
        double area;
        
        //get the radious from the user
        System.out.print("Enter the radius: ");
        radius = stdIn.nextDouble();
        
        area = radius * radius * PI;
        
        System.out.println("The area of the circle is: "+area);
    } // end main
    
} //end class ComputeArea
