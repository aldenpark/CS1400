/**
 * @filename: VowelCounterDriver.java
 * @author: Alden Park
 * @date: 10/24/2017
 * @description: Week 9 In Class Assignment
 */

import java.util.Scanner;

/**
 * This drives the VowelCounter class
 */
public class VowelCounterDriver {
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        VowelCounter vc = new VowelCounter();
        String lineOfChars;
        
        do {
            System.out.print("Enter a line of characters (press enter by itself to quit): ");
            lineOfChars = stdIn.nextLine();
            if(!"".equals(lineOfChars))
                vc.processLine(lineOfChars);
        }
        while(!"".equals(lineOfChars));
        
        vc.printSummary();
    } // end main
} // end class VowelCounterDriver
