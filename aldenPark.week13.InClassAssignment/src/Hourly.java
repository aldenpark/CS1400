/**
 * @filename: Hourly.java
 * @author: Alden Park
 * @date: 11/21/2017
 * @description: Week 13 in Class Assignment
 */

/**
 * This class implements an employee paid by the hour.
 */
public class Hourly extends Employee {
    private double hourlyRate;
    private double hours = 0.0;
    
    public Hourly(String name, double rate)
    {
        super(name);
        hourlyRate = rate;
    } // end constructor
    
    @Override
    public double getPay()
    {
        double pay = hourlyRate * hours;
        hours = 0.0;
        return pay;
    } // end getPay
    
    public void addHours(double hours)
    {
        this.hours += hours;
    } // end addHours
} // end class Hourly
