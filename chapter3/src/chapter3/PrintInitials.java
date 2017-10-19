/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;
import java.util.Scanner;

/**
 * PrintInitials
 * @author Alden Park
 * 
 * Print the initials of the first and last name entered
 */
public class PrintInitials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String first;
        String last;
        
        System.out.print("Enter first and last name separated by a space: ");
        first = stdIn.next();
        last = stdIn.next();
        System.out.println("Your initials are "+first.charAt(0)+last.charAt(0)+".");
        
    } // end main
    
} // end class PrintInitials
