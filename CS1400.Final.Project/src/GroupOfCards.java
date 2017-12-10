/**
 * @filename: GroupOfCards.java
 * @author: Alden Park
 * @date: 11/23/2017
 * @description: Final Project
 */

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.io.PrintWriter;
import java.util.Arrays;

public abstract class GroupOfCards {
    
    private enum Suit
    {
        HEARTS,
        SPADES,
        CLUBS,
        DIAMONDS
    } // end enum Suit
    
    private enum CardValues
    {
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        private final int value;

        private CardValues (int value)
        {
            this.value = value;
        }
        
        public int getValue()
        {
            return value;
        }
    } // end enum CardValues
    
    public List<Card> deck;
    
    public GroupOfCards()
    {
        WriteToFile(new ArrayList<>(Arrays.asList()), false); // clear output file
    } // end construct
    
    public abstract void initialize();
    
    public final void BuildDeck ()
    {
        deck = new ArrayList<>();
        for (Suit s : Suit.values()) {
            for(CardValues v : CardValues.values()) {
                deck.add(new Card(v.getValue(), s.toString()));
            }
        }
    } // end Deck
        
    public final HashMap<Integer, Deque<Card>> DealCards(List<Card> cards, int numPlayers, int numCards) {
        HashMap<Integer, Deque<Card>> hands = new HashMap<>();
        Card card;
        for(int i=0; i<numPlayers; i++){
            hands.put(i, new ArrayDeque());
        }
        if(numCards > (int)(cards.size() / numPlayers)) {
            numCards = (cards.size() / numPlayers);
        }
        //System.out.println("\nTotal Cards: " + cards.size() + ", Each player gets " + numCards + " cards\n");
        for(int a=0;a<(numCards*numPlayers);) {
            for(int i=0; i<numPlayers;i++){
                card = cards.get(a);
                hands.get(i).add(
                    new Card(card.getCardNumber(), card.getSuit())
                );
                a++;
            }
        }
        return hands;
    } // end DealCards
    
    public final void WriteToFile(List<String> GameOutput, boolean append)
    {
        String FileGameResults = this.getClass().getName() + ".txt";
        if("GameOfWar".equals(this.getClass().getName())) // didn't add results to the other filenames since it wasn't specified
            FileGameResults = "GameOfWarResults.txt";
        
        try( PrintWriter fileGameResults = new PrintWriter(new FileWriter(FileGameResults, append)) ) {
            GameOutput.forEach((_item) -> {
                System.out.println(_item);
                fileGameResults.println(_item.replaceAll("\u001B\\[[;\\d]*m", "")); // remove ascii color codes
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } finally {
            
        }
    } // end WriteToFile
    
    public final static class Card implements Comparable<Card>{
        
        private final int num;
        private final String suit;

        // using construct as setter since more then one value
        public Card(int num, String suit)
        {
            this.num = num;
            this.suit = suit;
        } // end Card constructor

        public int getCardNumber()
        {
            return num;
        } // end getCardNumber

        public String getSuit()
        {
            return suit;
        } // end getSuit
        
        @Override
	public int compareTo(Card compareCard) {
            int compareNum = ((Card) compareCard).getCardNumber();
            //ascending order
            return this.num - compareNum;
	} // end compareTo

        @Override
        public String toString()
        {
            return Integer.toString(num) + " of " + suit;
        } // end toString
        
    } // end class Card
    
} // end class GroupOfCards
