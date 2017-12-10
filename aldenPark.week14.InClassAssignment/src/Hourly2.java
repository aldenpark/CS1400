/**
 * @filename: Hourly2.java
 * @author: Alden Park
 * @date: 11/28/2017
 * @description: Week 14 InClass Assignment
 */

public class Hourly2 extends Employee2 {
    private double hourlyRate;
    private double hours = 0.0;
    
    public Hourly2(String name, double rate)
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
    
} // end class Hourly2
