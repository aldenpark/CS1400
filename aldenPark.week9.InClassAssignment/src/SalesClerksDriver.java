/**
 * @filename: SalesClerksDriver.java
 * @author: Alden Park
 * @date: 10/24/2017
 * @description: Week 9 In Class Assignment
 */

import java.util.Scanner;

/**
 * This drives the SalesClerks class
 */
public class SalesClerksDriver {
    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        SalesClerks clerks = new SalesClerks(2);
        String name;
        
        System.out.print("Enter clerk's name (q to quit): ");
        name = stdIn.nextLine();
        while(!name.equals("q")) {
            System.out.print("Enter sale amount: ");
            clerks.addSale(name, stdIn.nextDouble());
            stdIn.nextLine();  // flush newline
            System.out.print("Enter clerks's name (q to quit): ");
            name = stdIn.nextLine();
        } // end while
        clerks.dumpData();
    } // end main
} // end class SalesClerksDriver
