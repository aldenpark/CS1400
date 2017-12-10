/**
 * @filename: Factorial.java
 * @author: Alden Park
 * @date: 11/16/2017
 * @description: Week 12 InClass Assignment
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        int num;
        
        System.out.print("Enter a non-negative number: ");
        num = stdIn.nextInt();
        if(num >= 0) {
            System.out.println(factorial(num));
        }
    } // end main
    
    private static int factorial(int n)
    {
        if(n == 1 || n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    } // end factorial
} // end class Factorial
