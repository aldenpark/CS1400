/**
 * @filename: Mouse2.java
 * @author: Alden Park
 * @date: 10/3/2017
 * @description: This class models a mouse for grown simulation program.
 */
public class Mouse2 {
    private int age = 0; // age in days
    private double weight = 1.0; // weight in grams
    private double percentGrowthRate; // % daily weight gain
    
    /**
     * This method assigns the mouse's percent growth rate
     * @param percentGrowthRate 
     */
    public void setPercentGrowthRate(double percentGrowthRate)
    {
        this.percentGrowthRate = percentGrowthRate;
    } // end setPercentGrowthRate
    
    public int getAge() {
        return this.age;
    } // end getAge

    public double weight() {
        return this.weight;
    } // end weight

    /**
     * This method simulates one day of growth for the mouse.
     */
    public void grow(int days)
    {
        for (int i=0; i<days; i++)
        {
            this.weight += (0.1 * this.percentGrowthRate * this.weight);
        }
        this.age += days;
    } // end grow
    
} // end class Mouse
