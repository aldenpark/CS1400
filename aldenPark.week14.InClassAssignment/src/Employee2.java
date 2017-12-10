/**
 * @filename: Employee2.java
 * @author: Alden Park
 * @date: 11/28/2017
 * @description: Week 14 InClass Assignment
 */

public abstract class Employee2 {
    String name;
    public abstract double getPay();

    public Employee2(String name)
    {
        this.name = name;
    } // end constructor
    
    public void printPay(int date)
    {
        System.out.printf("%2d %10s: %8.2f\n", date, name, getPay());
    } // end printPay
    
} // end class Employee2
