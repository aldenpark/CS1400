/**
 * @filename: SalesClerk.java
 * @author: Alden Park
 * @date: 10/24/2017
 * @description: Week 9 In Class Assignment
 */

/**
 * This class stores and retrieves a sales clerk's data.
 */
public class SalesClerk {
    private String name;            // sales clerk's name
    private double sales = 0.0;     // total sales for cleark
    
    public SalesClerk(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSales()
    {
        return sales;
    }
    
    /**
     * Adjust clerk's total sales by adding the passed-in sale.
     */
    public void adjustSales(double amount)
    {
        sales += amount;
    }
} // end class SalesClerk
