package chapter4;
import java.util.Scanner;
/**
 * Filename: Zodiac.java
 * Author: Alden Park
 * Date: 9/12/2017
 * Description: Display the Chinese Zodiac.
 */
public class Zodiac {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        // print enter year to Zodiac
        System.out.print("Enter a year to see the Zodiac: ");
        // int year
        int year = stdIn.nextInt();
        
        // month = year % 12
        final int month = year % 12; // used math equation listed in class
        
        String zodiacSymbol = "";
        
        // use switch to find zodiacSymbol
        switch (month) {
            case 1:
                zodiacSymbol = "Monkey";
              break;
            case 2:
                zodiacSymbol = "Rooster";
              break;
            case 3:
                zodiacSymbol = "Dog";
              break;
            case 4:
                zodiacSymbol = "Pig";
              break;
            case 5:
                zodiacSymbol = "Rat";
              break;
            case 6:
                zodiacSymbol = "Ox";
              break;
            case 7:
                zodiacSymbol = "Tiger";
              break;
            case 8:
                zodiacSymbol = "Rabbit";
              break;
            case 9:
                zodiacSymbol = "Dragon";
              break;
            case 10:
                zodiacSymbol = "Snake";
              break;
            case 11:
                zodiacSymbol = "Horse";
              break;
            case 12:
                zodiacSymbol = "Sheep";
              break;
        }
         
        // print “For the year you provided, XXXX, the Chinese Zodiac is: zodiacSymbol”
        System.out.println("For the year you provided, " + year + ", the Chinese Zodiac is: " + zodiacSymbol);
    } // end main
    
} // end class Zodiac
