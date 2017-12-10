/**
 * @filename: GameDriver.java
 * @author: Alden Park
 * @date: 11/23/2017
 * @description: Final Project
 */

import java.util.Scanner;

public class GameDriver {
    // I didn't find a use for this until QA testing to uncover a possible exception, 
    // but regression testing wasn't hit on so I'm not sure this is why you wanted it...
    final static int NUM_GAMES = 1;
    
    private static GroupOfCards game = null;
    
    private static void GameOptions()
    {
        Scanner stdIn = new Scanner(System.in);
        String input;
        System.out.print("\nWould you like to play a game?\n\n"+
                "1) War\n" + 
                "2) Magic Card Shuffler and Sorter\n"+
                "Q) Quit");
        
        boolean valid = false;
        do {
            System.out.print("\nEnter 1, 2, or Q ==> ");
            input = stdIn.next().toLowerCase();
            switch(input){
                case "1":
                    game = new GameOfWar();
                    valid = true;
                  break;
                case "2":
                    game = new ShufflerSorter();
                    valid = true;
                  break;
                case "q":
                    valid = true;
                  break;
                default:
                    System.out.print("Invalid Selection.");
            } // end switch
        } while(!valid); // end do while
        if(game != null) {
            for(int i=0;i<NUM_GAMES;i++) {
                game.initialize();
            }
        }
    } // end GameOptions
    

    public static void main(String args[])
    {
        GameOptions();
    } // end main
    
} // end class GameDriver
