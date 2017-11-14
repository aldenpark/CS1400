
import java.util.ArrayList;
import java.util.List;
//import java.util.Collections;

/**
 * @filename: Deck.java
 * @author: Alden Park
 * @date: 11/02/2017
 * @description: Week 10 Homework Assignment
 */

/**
 * This class deals a Deck of cards.
 */
public class Deck {
    List<Card> card;
    
    /**
     * Deck constructor:
     * The Deck constructor should initialize your ArrayList with the 52 cards found in a standard deck. 
     * Each card is a Card object. Each Card object contains two instance variables ─ num and suit. 
    */
    public Deck()
    {
        // black (Spades ♠), red (Hearts ♥), blue (Diamonds ♦) and green (Clubs ♣)
        final char[] SUIT = {'C','D','H','S'};
        card = new ArrayList<>();
        
        for(char s : SUIT) {
            for(int i=1; i<=13;i++) {
                card.add(new Card(i, s));
            }
        }
        //Collections.shuffle(card);
    } // end construct
    
    /**
     * toString:
     * This method returns the deck’s contents using the format shown in the output 
     * session. In particular, note that toString should insert a newline after every 
     * fifth card. Hint: In coming up with a return value, use a String local variable. 
     * As you generate card values and newlines, concatenate those items to your local 
     * variable using the += operator.
    */
    public String toString()
    {
        String deck = "";
        int i = 0;
        for(Card c : card) {
            deck += c.toString() + " ";
            i++;
            if(i == 5) {
                deck += "\n";
                i = 0;
            }
        }
        return deck;
    }
    
    /**
     * dealCard:
     * This method removes the highest-indexed card in the ArrayList and returns it. 
     * In general, a method should not do more than what it’s supposed to do. Thus, 
     * dealCard should not print anything.
    */
    public String dealCard() {
        Card nextCard = card.get(card.size() - 1);
        card.remove(card.size() - 1);
        return nextCard.toString();
    }
    
} // end class Deck
