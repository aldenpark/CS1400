/**
 * @filename: SalesPerson.java
 * @author: Alden Park
 * @date: 11/14/2017
 * @description: Week 12 inClass Assignment
 */

/**
 * This class implements a car dealership sales manager.
 */
public class SalesPerson {
    private String name;
    private double sales = 0.0;
    
    public SalesPerson(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
}
