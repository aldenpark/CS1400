/**
 * @filename: Salaried2.java
 * @author: Alden Park
 * @date: 11/28/2017
 * @description: Week 14 InClass Assignment
 */

public class Salaried2 extends Employee2 {
    double salary;
    
    public Salaried2(String name, double salary)
    {
        super(name);
        this.salary = salary;
    } // end constructor
    
    @Override
    public double getPay()
    {
        return this.salary / 24;
    } // end getPay
    
} // end class Salaried2
