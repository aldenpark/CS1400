/**
 * @filename: getIntFromUser.java
 * @author: Alden Park
 * @date: 11/28/2017
 * @description: Week 14 in Class Assignment
 */

import java.util.Scanner;

public class getIntFromUser {
    public static int getIntFromUser() {
        Scanner stdIn = new Scanner(System.in);
        String xStr;                    // user entry
        boolean valid = false;          // is user entry a valid integer?
        int x = 0;                      // integer from of user entry
        
        System.out.print("Enter an integer: ");
        xStr = stdIn.next();
        
        do {
            try {
                valid = false;
                x = Integer.parseInt(xStr);
                valid = true;
            }
            catch(NumberFormatException nfe) {
                System.out.print("Invalid entry. Enter an integer");
                xStr = stdIn.next();
            }
        } while(!valid);
        
        return x;
    } // end getIntFromUser
    
    public static void main(String agrs[]) {
        System.out.println(getIntFromUser());
    } // end main
} // end class getIntFromUser
