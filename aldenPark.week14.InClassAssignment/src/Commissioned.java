/**
 * @filename: Commissioned.java
 * @author: Alden Park
 * @date: 11/28/2017
 * @description: Week 14 InClass Assignment
 */

public class Commissioned extends Employee2 implements Commission {
    
    private double sales = 0.0;
    public Commissioned(String name)
    {
        super(name);
        this.sales = sales;
    } // end constructor
    
    @Override
    public void addSales(double sales)
    {
        this.sales +=  sales;
    } // end addSales
    
    @Override
    public double getPay()
    {
        double pay = COMMISSION_RATE * sales;
        
        sales = 0.0;
        return pay;
    } // end getPay
    
} // end class Commissioned
