
import java.util.Map;
import java.util.HashMap;

/**
 * @filename: DiceSimulation.java
 * @author: Alden Park
 * @date: 10/29/2017
 * @description: Week 9 In Class Assignment
 */

/**
 * This class simulates the rolling of two dice
 */
import java.util.Scanner;

public class DiceSimulation {
    private Map<Integer, Integer> results;
    private int numRolls;
    
    /**
     * Start / Reset Simulation
     */
    public void newSimulation()
    {
         // reset values in case of a new run
        results = new HashMap<Integer, Integer>();
        numRolls = 0;
        for(int i=2;i<=12;i++) { // set values to 0;
            results.put(i,0);
        }
        
        Scanner stdIn = new Scanner(System.in);
        System.out.print("How many dice rolls would you like to simulate? ");
        if(stdIn.hasNextInt()) {
            rollDice(stdIn.nextInt());
        } else {
            System.out.println("Invalid Entry.");
        }
    } // end DiceSimulation
    
    /**
     * Roll additional amount of times
     */
    public void additionalRolls()
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("How many additional rolls? ");
        if(stdIn.hasNextInt()) {
            rollDice(stdIn.nextInt());
        } else {
            System.out.println("Invalid Entry.");
        }
    } // end additionalRolls
    
    /**
     * Roll the dice number of times and append to results
     */
    private void rollDice(int rollAmount)
    {
        int roll;
        for(int i=0;i<rollAmount;i++) {
            int die1 = (int)(Math.random()*6) + 1;
            int die2 = (int)(Math.random()*6) + 1;
            int n = results.get(die1+die2) + 1;
            results.put(die1+die2, n);
        }
        numRolls += rollAmount;
    } // end rollDice
    
    /**
     * Print results
     */
    public void printReport()
    {
        System.out.print("\nDICE ROLLING SIMULATION RESULTS\n" +
            "Each \"*\" represents 1% of the total number of rolls.\n" +
            "Total number of rolls = " + numRolls + ".\n\n");
        for(Integer key : results.keySet()) {
            System.out.print(key + ": ");
            for(int i=0;i<results.get(key);i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    } // end printReport
    
} // end class DiceSimulation
