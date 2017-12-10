/**
 * @filename: Employee.java
 * @author: Alden Park
 * @date: 11/23/2017
 * @description: Week 13 Homework Assignment
 */

public class SalariedPlusCommission extends Salaried {
    int salesPastWeek = 0;
    float commissionRate = 0.0f;

    public SalariedPlusCommission(String name, String ssn, int bMonth, int bWeek, double wSalary, int salesPastWeek, float commissionRate)
    {
        super(name, ssn, bMonth, bWeek, wSalary);
        this.salesPastWeek = salesPastWeek;
        this.commissionRate = commissionRate;
    } // end Constructor

    /*
    Calculates earnings for a SalariedPlusCommission employee. 
    SalariedPlusCommission employees are paid a base salary plus a percentage of 
    their sales. “Percentage of their sales” equates to the product of their 
    sales times their commission rate.
    */
    @Override
    public double getEarnings()
    {
        double paycheck = weeklySalary + ( salesPastWeek * commissionRate );
        paycheck += getBonus();
        return paycheck > 1000 ? 1000 : paycheck;
    } // end getEarnings
    
} // end class SalariedPlusCommission
