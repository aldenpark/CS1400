package aldenpark.week4.inclassassignments;
import java.util.Scanner;

/**
 * @filename: Lottery.java
 * @author: Alden Park
 * @date: 9/19/2017
 * @description: Week 4 in class Assignment
 */
public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String input;
        int winingNumber = (int) (Math.random() * Integer.MAX_VALUE + 1);
        
        System.out.println("Want to win a million dollars?");
        System.out.println("If so, guess the winning number (a" +
                " number between 1 and " + Integer.MAX_VALUE + ").");
        
        do{
            System.out.print("Insert $1.00 and enter your number or 'q' to quite: ");
            input = stdIn.nextLine();
            if(input.equals("give me a hint")){
                System.out.println("try: " + winingNumber);
            }
            else if (!input.equals("q"))
            {
                if(Integer.parseInt(input) == winingNumber)
                {
                    System.out.println("YOU WIN!");
                    input = "q"; // if someone wins, they're forced to quit
                }
                else
                {
                    System.out.println("Sorry, good guess, but not quite right.");
                }
            } // end else if
        } while (!input.equals("q"));
        System.out.println("Thank for playing. Come again!");
    } // end main
    
} // end Lotttery class
