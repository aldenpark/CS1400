/**
 * @filename: GameOfWar.java
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

public class GameOfWar extends GroupOfCards implements Runnable {

    private final int TIMER_SPEED = 1; // 5 miliseconds
    private final Thread thread;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
        
    public GameOfWar() {
        super();
        thread = new Thread (this, "gameofwarloop");
    } // end construct
    
    boolean playGame = true;
    
    @Override
    public void run() {
        while(playGame){
            try {
                //Slows the code down
                Thread.sleep(TIMER_SPEED);
                play();
            } catch (InterruptedException e) {
                System.out.println(e);
                //e.printStackTrace();
            }
        }
    } // end run
    
    private Deque<Card> playerOneDeck;
    private Deque<Card> playerTwoDeck;
    
    @Override
    public void initialize()
    {
        BuildDeck();
        Collections.shuffle(deck);
        HashMap<Integer, Deque<Card>> hands = DealCards(deck, 2, 26); // build hands of cards and assign the cards between 2 players, 26 cards for each
        playerOneDeck = hands.get(0);
        playerTwoDeck = hands.get(1);
        
        /*for(int i=0;i<hands.size();i++){ // debug
            System.out.println("Player "+i+" Cards: " + hands.get(i).size());
        }*/
        thread.start();
    } // end initialize
    
    private void play()
    {
        List<Card> tempDeck = new ArrayList<>();
        List<String> logResults = new ArrayList<>();
        
        if(!playerOneDeck.isEmpty() && !playerTwoDeck.isEmpty()) {
            Card iPlayer1 = playerOneDeck.removeFirst();
            Card iPlayer2 = playerTwoDeck.removeFirst();
            
            // print results of cards
            logResults.add("Player 1 (" + ( playerOneDeck.size() < 10 ? ANSI_YELLOW : ANSI_CYAN ) + ( playerOneDeck.size() + 1 ) + ANSI_RESET + 
                        "): " + ANSI_PURPLE + iPlayer1.getCardNumber() + ANSI_RESET + 
                    " - Player 2 (" + ( playerTwoDeck.size() < 10 ? ANSI_YELLOW : ANSI_CYAN ) + ( playerTwoDeck.size() + 1 ) + ANSI_RESET + 
                        "): " + ANSI_PURPLE + iPlayer2.getCardNumber() + ANSI_RESET);
            
            tempDeck.add(new Card(iPlayer1.getCardNumber(), iPlayer1.getSuit()));
            tempDeck.add(new Card(iPlayer2.getCardNumber(), iPlayer2.getSuit()));

            if(iPlayer1.getCardNumber() == iPlayer2.getCardNumber()) { // tie
                
                boolean war = true;
                
                do { // loop in case the cards match again
                    logResults.add(ANSI_RED + "WAR!" + ANSI_RESET);
                
                    int flipNumCards = 3; // flipping 3 cards per assignment
                    if(playerOneDeck.size() < flipNumCards){
                        flipNumCards = playerOneDeck.size() == 1 ? 1 : playerOneDeck.size()-1;
                    }
                    if(playerTwoDeck.size() < flipNumCards){
                        flipNumCards = playerTwoDeck.size() == 1 ? 1 : playerTwoDeck.size()-1;
                    }

                    for(int f=0;f<flipNumCards;f++) {
                        iPlayer1 = playerOneDeck.removeFirst();
                        tempDeck.add(new Card(iPlayer1.getCardNumber(), iPlayer1.getSuit()));
                        iPlayer2 = playerTwoDeck.removeFirst();
                        tempDeck.add(new Card(iPlayer2.getCardNumber(), iPlayer2.getSuit()));
                    }

                    // print results of cards
                    logResults.add("Player 1: " + ANSI_PURPLE + iPlayer1.getCardNumber() + ANSI_RESET + " - Player 2: " + ANSI_PURPLE + iPlayer2.getCardNumber() + ANSI_RESET);
                    
                    if((iPlayer1.getCardNumber() != iPlayer2.getCardNumber()) || playerOneDeck.size() <= 1 || playerTwoDeck.size() <= 1) {
                        war = false;
                    }
                
                } while(war); // end do while
            } // end if statement for tie
            
            Collections.shuffle(tempDeck);
            if (iPlayer1.getCardNumber() > iPlayer2.getCardNumber())
            {
                playerOneDeck.addAll(tempDeck);
            }
            else {
                playerTwoDeck.addAll(tempDeck);
            }
            tempDeck.clear();
        } else {
            displayWinner();
        }
        
        WriteToFile(logResults, true);
    } // end play
    
    private void displayWinner()
    {
        
        playGame = false;
        
        if(playerOneDeck.isEmpty()){
            WriteToFile(new ArrayList<>(Arrays.asList(ANSI_GREEN + "Player Two Wins!\n" + ANSI_RESET)), true);
        }
        else if(playerTwoDeck.isEmpty()){
            WriteToFile(new ArrayList<>(Arrays.asList(ANSI_GREEN + "Player One Wins!\n" + ANSI_RESET)), true);
        }
        //System.exit(0);
    } // end displayWinner
} // end class GameOfWar
