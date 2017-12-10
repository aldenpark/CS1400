/**
 * @filename: ShufflerSorter.java
 * @author: Alden Park
 * @date: 11/23/2017
 * @description: Final Project
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ShufflerSorter extends GroupOfCards {

    private int numPlayers = 0;

    public ShufflerSorter() {
        super();
    } // end construct
    
    private void setNumPlayers(int n) {
        numPlayers = n;
    } // end setNumPlayers

    private int getNumPlayers() {
        return numPlayers;
    } // end getNumPlayers
    
    @Override
    public void initialize()
    {
        Scanner stdIn = new Scanner(System.in);
        String input;
        BuildDeck();
        Collections.shuffle(deck);

        int n;
        do {
            System.out.print("\nHow many players? (1-7) ==> ");
            input = stdIn.next();
            n = Integer.decode(input);
            if(Integer.decode(input) <= 7) {
                setNumPlayers(n);
            } else {
                n = 0;
                System.out.print("Invalid Selection.");
            }
        } while(n == 0); // end do while

        int maxCards = (52 / getNumPlayers());
        int numCards = 0;
        do {
            System.out.print("\nHow many cards for each player? (1-" + maxCards + ") ==> ");
            input = stdIn.next();
            numCards = Integer.decode(input);
            if(numCards <= maxCards) {
            } else {
                numCards = 0;
                System.out.print("Invalid Selection.");
            }
        } while(numCards == 0); // end do while
        
        play(numCards);
    } // end initialize
    
    private void play(int numCards) {
        List<String> logResults = new ArrayList<>();
        ArrayList<Card> playerDeck;
        ArrayList<ArrayList<Card>> players = new ArrayList<>();
        Card card;
        int highestCard, pPoint;
        ArrayList handWin = new ArrayList();
        int playerPoints[] = new int[getNumPlayers()];
        
        HashMap<Integer, Deque<Card>> hands = DealCards(deck, getNumPlayers(), numCards);  // build hands of cards between `numPlayers`, `numCards` cards for each player
        for(int p = 0;p<getNumPlayers();p++) {
            playerDeck = new ArrayList(hands.get(p));
            Collections.sort(playerDeck);
            players.add(p, playerDeck);
        } // end for
        
        playerDeck = players.get(0); // for size
        for(int i=0;i<playerDeck.size();i++) {
            handWin.clear();
            highestCard = 0;
            for(int p=0;p<getNumPlayers();p++) {
                playerDeck = players.get(p);
                card = playerDeck.get(i);
                logResults.add("Player " + (p+1) + ": " + card.getCardNumber());
                if(card.getCardNumber() > highestCard) {
                    highestCard = card.getCardNumber();
                    handWin.clear();
                    handWin.add(p);
                } else if(card.getCardNumber() == highestCard) {
                    handWin.add(p);
                }
            } // end for getNumPlayers
            logResults.add("");
            for(int w=0;w<handWin.size();w++) {
                pPoint = (int)handWin.get(w);
                logResults.add("Point to Player: " +(pPoint+1));
                playerPoints[pPoint]++;
            } // end for handWin
            logResults.add("");
        } // end for playerDeck
        WriteToFile(logResults, true);
        displayWinner(playerPoints);
    } // end play
    
    private void displayWinner(int playerPoints[])
    {
        int highestPoint = 0;
        for(int p=0;p<getNumPlayers();p++) {
            WriteToFile(new ArrayList<>(Arrays.asList("Player " + (p+1) + " points: " + playerPoints[p])), true);
            if(highestPoint < playerPoints[p]) {
                highestPoint = playerPoints[p];
            }
        } // end for
        WriteToFile(new ArrayList<>(Arrays.asList("")), true);
        for(int p=0;p<getNumPlayers();p++) {
            if(highestPoint == playerPoints[p]) {
                WriteToFile(new ArrayList<>(Arrays.asList("Player " + (p+1) + " Wins!")), true);
            }
        } // end for
    } // end displayWinner

}
