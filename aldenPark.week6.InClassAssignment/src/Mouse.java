/**
 * @filename: Mouse.java
 * @author: Alden Park
 * @date: 10/3/2017
 * @description: This class models a mouse for grown simulation program.
 */
public class Mouse {
    private int age;
    private double weight = 1.0;
    private double percentGrowthRate;
    
    /**
     * This method assigns the mouse's percent growth rate
     * @param percentGrowthRate 
     */
    public void setPercentGrowthRate(double percentGrowthRate)
    {
        this.percentGrowthRate = percentGrowthRate;
    } // end setPercentGrowthRate
    
    /**
     * This method simulates one day of growth for the mouse.
     */
    public void grow()
    {
        this.weight += (0.1 * this.percentGrowthRate * this.weight);
        this.age++;
    } // end grow
    
    /**
     * This method prints the mouse's age and weight.
     */
    public void display()
    {
        System.out.printf("Age = %d, weight = %.3f\n", this.age, this.weight);
    } // end display
    
} // end class Mouse
