/**
 * @filename: SalariedAndCommissioned.java
 * @author: Alden Park
 * @date: 11/28/2017
 * @description: Week 14 InClass Assignment
 */

public class SalariedAndCommissioned extends Salaried2 implements Commission{
    private double sales;
    
    public SalariedAndCommissioned(String name, double salary)
    {
        super(name, salary);
    } // end constructor
    
    @Override
    public void addSales(double sales)
    {
        this.sales += sales;
    } // end addSales
    
    @Override
    public double getPay()
    {
        double pay = super.getPay() + COMMISSION_RATE * sales;
        
        sales = 0.0;
        return pay;
    } // end getPay
} // end class SalariedAndCommissioned
