/**
 * @filename: PrintReverseMessageIterative.java
 * @author: Alden Park
 * @date: 11/16/2017
 * @description: Week 12 InClass Assignment
 */

import java.util.Scanner;

public class PrintReverseMessageIterative {
    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        String msg; // user-entered message
        
        System.out.print("Enter a message: ");
        msg = stdIn.nextLine();
        printReversemessage(msg);
        System.out.println();
    } // end main
    
    private static void printReversemessage(String msg)
    {
        int index; // position of last character in msg;
        
        if(!msg.isEmpty()) {
            index = msg.length() - 1;
            System.out.print(msg.charAt(index));
            printReversemessage(msg.substring(0, index));
        }
    } // end printReversemessage
} // end class PrintReverseMessageIterative
