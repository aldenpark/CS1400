/**
 * @filename: PayrollDriver.java
 * @author: Alden Park
 * @date: 11/23/2017
 * @description: Week 13 Homework Assignment
 */

import java.util.Locale;
import java.util.Scanner;

public class PayrollDriver {
    
    public static void RunPayRoll() {
        Scanner stdIn = new Scanner(System.in);
        stdIn.useLocale(Locale.US); // use US locale to be able to identify floats in the string
        Employee[] employees;
        String name, ssn;
        int numEmployees = 0, employeeType, bMonth, bWeek, salesPastWeek;
        double hPay, hoursWorked, weeklySalary;
        float commissionRate;
        
        System.out.print("Number of employees: ");
        if(stdIn.hasNextInt()){
            numEmployees = stdIn.nextInt();
        }
        employees = new Employee[numEmployees];
        
        for(int i=0;i<numEmployees;i++) {
            System.out.print("\nPROFILE FOR EMPLOYEE #" + (i+1));
            
            employeeType = 0;
            do {
                System.out.print("\ntype Hourly(1), Salaried(2), Salaried plus Commission(3)\n Enter 1, 2, or 3 ==> ");
                if(stdIn.hasNextInt() && stdIn.hasNextLine()) {
                    employeeType = stdIn.nextInt();
                }
            } while(employeeType < 1 || employeeType > 3);
            
            name = "";
            System.out.print("Name ==> ");
            while("".equalsIgnoreCase(name)) {
                name = stdIn.nextLine();
            }
            
            ssn = "";
            System.out.print("Social security number ==> ");
            while("".equals(ssn)) {
                ssn = stdIn.nextLine();
            }
            
            bMonth = 0;
            do {
                System.out.print("Birthday month (1-12) ==> ");
                if(stdIn.hasNextInt()) {
                    bMonth = stdIn.nextInt();
                }
            } while(bMonth < 1 || bMonth > 12);
            
            bWeek = 0;
            do {
                System.out.print("Birthday bonus week (1-4) ==> ");
                if(stdIn.hasNextInt()) {
                    bWeek = stdIn.nextInt();
                }
            } while(bWeek < 1 || bWeek > 4);

            switch(employeeType){
                case 1:
                    hPay = 0;
                    do {
                        System.out.print("Hourly pay ==> ");
                        if(stdIn.hasNextDouble()) {
                            hPay = stdIn.nextDouble();
                        }
                    } while(hPay < 1);
                    
                    hoursWorked = 0;
                    do {
                        System.out.print("Hours worked this past week ==> ");
                        if(stdIn.hasNextDouble()) {
                            hoursWorked = stdIn.nextDouble();
                        }
                    } while(hoursWorked < .1);
                    
                    employees[i] = new Hourly(name, ssn, bMonth, bWeek, hPay, hoursWorked);
                  break;
                case 2:
                case 3:
                    weeklySalary = 0;
                    do {
                        System.out.print("Salary ==> ");
                        if(stdIn.hasNextDouble()) {
                            weeklySalary = stdIn.nextDouble();
                        }
                    } while(weeklySalary < 1);
                    
                    if(employeeType == 2) {
                        employees[i] = new Salaried(name, ssn, bMonth, bWeek, weeklySalary);
                    }
                    else if(employeeType == 3) {
                        salesPastWeek = 0;
                        System.out.print("Sales for this past week ==> ");
                        if(stdIn.hasNextInt()) {
                            salesPastWeek = stdIn.nextInt();
                        } // no while loop because maybe they were in training that week and had no sales.
                        
                        commissionRate = 0.0f;
                        do {
                            System.out.print("Sales commission rate (fraction paid to employee) ==> "); // .25
                            if(stdIn.hasNextFloat()) {
                                commissionRate = stdIn.nextFloat();
                            }
                        } while(commissionRate < 0.01);

                        employees[i] = new SalariedPlusCommission(name, ssn, bMonth, bWeek, weeklySalary, salesPastWeek, commissionRate);
                    }
                  break;
            } // end switch
        } // end for loop
        
        System.out.println("\nPAYCHECK REPORT:\n");
        
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        } // end for loop
        
    } // end RunPayRoll
    
    public static void main(String[] args)
    {
        RunPayRoll();
    } // end main
    
} // end class PayrollDriver
