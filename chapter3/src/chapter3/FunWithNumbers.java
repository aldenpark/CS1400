package chapter3;
import java.util.Scanner;

/**
 * Filename: FunWithNumbers.java
 * Author: Alden Park
 * Date: 9/12/2017
 * Description: Prompts the user for three numbers and displays the sum, average, product, smallest, and largest of the numbers
 */

public class FunWithNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int num1 = stdIn.nextInt();
        System.out.print("Enter number two: ");
        int num2 = stdIn.nextInt();
        System.out.print("Enter number three: ");
        int num3 = stdIn.nextInt();
        
        final int sumNumbers = num1 + num2 + num3;
        final int average = sumNumbers / 3;
        final int product = num1 * num2 * num3;
        final int smallest = Math.min(Math.min(num1, num2), num3);
        final int largest = Math.max(Math.max(num1, num2), num3);
        
        System.out.println("Sum: " + sumNumbers);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        
    } // end main
    
} // end class FunWithNumbers
