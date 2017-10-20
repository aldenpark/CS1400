/**
 * @filename: Shirt.java
 * @author: Alden Park
 * @date: 10/19/2017
 * @description: Week 8 in class Assignment
 */

/**
 * This generates a histogram of coin flips
 */
public class CoinFlips {
    public static void main(String args[])
    {
        final int NUM_OF_COINS = 3;         // number of Coins
        final int NUM_OF_REPS = 1000000;    // repetitions
        
        // The frequency array holds the number of times a particular number of heads occurred.
        int[] frequency = new int[NUM_OF_COINS + 1];
        int heads;                          // heads in currnt group of flips
        double fractionOfReps;              // head count / repetitions
        int numOfAsterisks;                 // asterisks in one histogram bar
        
        for(int rep=0; rep<NUM_OF_REPS; rep++) {
            // perform a group of flips
            heads = 0;
            for(int i=0; i< NUM_OF_COINS; i++) {
                heads += (int) (Math.random() * 2);
            }
            frequency[heads]++;             // update appropriate bin
        } // end for
        
        System.out.println("Number of times each head count occurred:");
        for(heads=0; heads<=NUM_OF_COINS; heads++){
            System.out.print(" " + heads + " " + frequency[heads] + " ");
            fractionOfReps = (float) frequency[heads] / NUM_OF_REPS;
            numOfAsterisks = (int) Math.round(fractionOfReps * 100);
            
            for(int i=0; i<numOfAsterisks; i++){
                System.out.print("*");
            }
            System.out.println();
        } // end for
        
    } // end main
} // end class CountFlips
