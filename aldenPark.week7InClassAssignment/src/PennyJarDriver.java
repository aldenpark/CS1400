/**
 * @filename: PennyJarDriver.java
 * @author: Alden Park
 * @date: 10/12/2017
 * @description: Week 7 in class Assignment
 */

/**
 * This class drives the PennyJar class.
 */
public class PennyJarDriver
{
    public static void main(String[] args)
    {
        PennyJar pennyJar1 = new PennyJar();
        PennyJar pennyJar2 = new PennyJar();

        PennyJar.setGoal(4000);
        pennyJar1.addPenny();
        pennyJar1.addPenny();
        pennyJar2.addPenny();
        System.out.println(pennyJar1.getPennies());
        System.out.println(PennyJar.getAllPennies());
    } // end main
  
} // end class PennyJarDriver