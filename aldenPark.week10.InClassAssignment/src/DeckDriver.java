    /**
 * @filename: DeckDriver.java
 * @author: Alden Park
 * @date: 11/02/2017
 * @description: Week 10 Homework Assignment
 */

/**
 * This class tests the Deck class.
 */
public class DeckDriver {
  public static void main(String[] args)
  {
    Deck deck = new Deck();
    System.out.println(deck.dealCard());
    System.out.println(deck.dealCard());
    System.out.println();
    System.out.println(deck);
  } // end main
} // end DeckDriver class
