/**
 * @filename: VendingMachineDriver.java
 * @author: Alden Park
 * @date: 10/21/2017
 * @description: Week 8 homework Assignment
 */

/**
 * This is a driver for the VendingMachine Class
 */
import java.util.Scanner;

public class VendingMachineDriver {
    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        char choice;            // user's choice of action
        boolean done = false;   // flag that says user wants to quit

        VendingMachine vm = new VendingMachine();

        System.out.println("Welcome to Alden's vending machine!\n");

        do
        {
            System.out.println(
              "Options: (i)nsert money, (s)elect an item," + " (q)uit");
            System.out.print("Enter i, s, or q ==> ");
            choice = stdIn.nextLine().charAt(0);

            switch (choice)
            {
              case 'i': case 'I':
                vm.insertMoney();
                break;
              case 's': case 'S':
                vm.selectItem();
                break;
              case 'q': case 'Q':
                done = true;
                break;
              default:
                System.out.println("Invalid selection.");
            } // end switch
        } while (!done);
    } // end main
} // end class VendingMachineDriver
