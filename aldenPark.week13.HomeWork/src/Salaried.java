/**
 * @filename: Employee.java
 * @author: Alden Park
 * @date: 11/23/2017
 * @description: Week 13 Homework Assignment
 */

public class Salaried extends Employee {
    double weeklySalary = 0.0f;
    
    public Salaried(String name, String ssn, int bMonth, int bWeek, double wSalary)
    {
        super(name, ssn, bMonth, bWeek);
        weeklySalary = wSalary;
    } // end Constructor
    
    @Override
    public double getEarnings()
    {
        double paycheck = weeklySalary;
        paycheck += getBonus();
        return paycheck > 1000 ? 1000 : paycheck;
    } // end getEarnings
    
} // end class Salaried
