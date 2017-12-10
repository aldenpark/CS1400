/**
 * @filename: Employee.java
 * @author: Alden Park
 * @date: 11/23/2017
 * @description: Week 13 Homework Assignment
 */

public class Hourly extends Employee {
    double hourlyPay = 0.0f;
    double hoursWorkedPastWeek = 0.0f;

    //Prompts the user for instance-variable values and loads the entries.
    public Hourly(String name, String ssn, int bMonth, int bWeek, double hPay, double hoursWorked)
    {
        super(name, ssn, bMonth, bWeek);
        hourlyPay = hPay;
        hoursWorkedPastWeek = hoursWorked;
    } // end Constructor
    
    /*
    Calculates earnings for an hourly employee. Hourly employees are paid by the 
    hour. If they work more than 40 hours in a week, then they receive overtime 
    pay for their overtime work. Overtime pay equals one and a half times their 
    normal hourly pay
    */
    @Override
    public double getEarnings()
    {
        double paycheck = hourlyPay * ( hoursWorkedPastWeek > 40 ? 40 : hoursWorkedPastWeek );
        if(hoursWorkedPastWeek > 40) {
            paycheck += ( hourlyPay * 1.5 ) * ( hoursWorkedPastWeek - 40 );
        }
        paycheck += getBonus();
        return paycheck > 1000 ? 1000 : paycheck;
    } // end getEarnings
    
} // end class Hourly
