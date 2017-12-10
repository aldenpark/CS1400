/**
 * @filename: Employee.java
 * @author: Alden Park
 * @date: 11/21/2017
 * @description: Week 13 in Class Assignment
 */

/**
 * This is a generic description of an employee
 */
public class Employee {
    private String name;
    
    public Employee(String name)
    {
        this.name = name;
    } // end constructor
    
    public void printPay(int date)
    {
        System.out.printf("%2d %10s: %8.2f\n", date, name, getPay());
    } // end printPay
    
    // This dummy method satisfies the compiler.
    public double getPay()
    {
        System.out.println("error! in dummy");
        return 0.0;
    } // end printPay
} // end class Employee
