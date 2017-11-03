/**
 * @filename: HungerGames.java
 * @author: Alden Park
 * @date: 11/02/2017
 * @description: Week 10 In Class Assignment
 */

import java.util.ArrayList;


/**
 * This class create an ArrayList of tributes.
 * It randomly choose one tribute and removes him/her.
 */
public class HungerGames {
    public static void main(String args[])
    {
        int decreasedIndex;     // index of deceased tribute
        String deceased;        // name of deceased tribute
        ArrayList<String> tributes = new ArrayList<>();
        
        tributes.add("Cato");
        tributes.add("Katniss");
        tributes.add("Peeta");
        tributes.add("Rue");
        tributes.add(1, "Finnick");
        decreasedIndex = (int) (Math.random() * tributes.size());
        deceased = tributes.remove(decreasedIndex);
        System.out.println(deceased + " is no longer in the game.");
        System.out.println("Remaining: " + tributes);
    } // end main
} // end HungerGames