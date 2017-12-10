/**
 * @filename: Employee.java
 * @author: Alden Park
 * @date: 11/23/2017
 * @description: Week 13 Homework Assignment
 */

import java.util.Calendar;

public abstract class Employee {
    String name;
    String socialSecurityNumber;
    int birthdayMonth;
    int birthdayWeek;
    
    // Prompts the user for instance-variable values and loads the entries
    public Employee(String name, String ssn, int bMonth, int bWeek)
    {
        this.name = name;
        socialSecurityNumber = ssn;
        birthdayMonth = bMonth;
        birthdayWeek = bWeek;
    } // end Constructor
    
    // Returns a string that shows the employee’s name, social security number, and paycheck..
    @Override
    public String toString()
    {
        double paycheck = getEarnings();
        return "employee: " + name + "\n" + 
                "social security number: " + socialSecurityNumber + "\n" + 
                "paycheck: " + String.format("%.2f", paycheck) + "\n";
    } // end toString
    
    /*
    Generates a $100 employee birthday bonus. Compare the employee’s birthday 
    with the current date found on your computer system. Use the Calendar class 
    to generate the current date. (See the Java API documentation.) If the 
    employee’s birthday month and birthday week match your computer system’s 
    current month and current week, then increment the employee’s paycheck by 
    $100. The birthdayMonth holds the month (1─12) in which the employee was 
    born. The birthdayWeek holds the week (1─4) that the employee chooses to 
    get paid his/her bonus. 
    */
    public int getBonus()
    {
        return (birthdayMonth == Calendar.getInstance().get(Calendar.MONTH)+1 && 
                birthdayWeek == Calendar.getInstance().get(Calendar.WEEK_OF_MONTH)) ? 100 : 0;
    } // end getBonus
    
    abstract double getEarnings();

} // end class Employee
