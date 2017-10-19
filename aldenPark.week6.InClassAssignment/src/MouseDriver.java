import java.util.Scanner;

/**
 * @filename: MouseDriver.java
 * @author: Alden Park
 * @date: 10/3/2017
 * @description: This is a driver for the Mouse class.
 */

public interface MouseDriver {
    
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        double growthRate;
        Mouse gus = new Mouse();
        Mouse jag = new Mouse();
        
        System.out.print("Enter % growth rate: ");
        growthRate = stdIn.nextDouble();
        gus.setPercentGrowthRate(growthRate);
        jag.setPercentGrowthRate(growthRate);
        gus.grow();
        jag.grow();
        gus.grow();
        gus.display();
        jag.display();
    } // end main
    
} // end class MouseDriver;
