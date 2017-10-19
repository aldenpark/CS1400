package chapter3;
import java.util.Scanner;

/**
 * Filename: BmiCalculator.java
 * Author: Alden Park
 * Date: 9/7/2017
 * Description: Prompts the user to enter a weight in pounds  and height in inches and 
 * display the BMI.
 */

public class BmiCalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args)
    {
        Scanner stdIn = new Scanner(System.in);
        double weight;
        int height;
        double bmi;
        final int metricConversion = 703;
        
        System.out.print("Enter your weight in pounds: ");
        weight = stdIn.nextDouble();
        
        System.out.print("Enter your height in inches: ");
        height = stdIn.nextInt();
        
        // Calculate the BMI 
        // BMI = 703·weight(lb)/height2(in2)    (U.S. Units)
        bmi = metricConversion * (weight / (height * height));
        
        System.out.println("BMI is: "+ bmi);
        
    } // end main
    
} // end class BmiCalculator
