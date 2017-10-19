/**
 * @filename: PennyJarDriver.java
 * @author: Alden Park
 * @date: 10/12/2017
 * @description: Week 7 in class Assignment
 */

/**
 * This class counts pennies stored in a group of penny jars.
 */
public class PennyJar
{
    private static int goal;
    private static int allPennies = 0;
    private int pennies = 0;

    public static void setGoal(int goal)
    {
        PennyJar.goal = goal;
    } // end setGoal

    public static int getAllPennies()
    {
        return PennyJar.allPennies;
    } // end getAllPennies
  
    public int getPennies()
    {
        return this.pennies;
    } // end getPennies

    public void addPenny()
    {
        System.out.println("Clink!");
        this.pennies++;
        PennyJar.allPennies++;
        if (PennyJar.allPennies >= PennyJar.goal)
        {
            System.out.println("Time to spend!");
        }
    } // end addPenny
  
} // end class PennyJar