package chapter4;
//import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 * @filename: TaxRate.java
 * @author: Alden Park
 * @date: 9/16/2017
 * @description: Calculate tax rate for user
 */

public class TaxRate {
    final Scanner stdIn = new Scanner(System.in);
            
    char filingStatus;
    int grossIncome;
    int numExemptions;
    int taxableIncome;
    
    /**
     * main method, start taxMain
     * @param args 
     */
    public static void main(String args[])
    {
        TaxRate taxRate = new TaxRate();
        taxRate.taxMain();
    } // end main
    
    /**
     * call methods to process taxes
     */
    public void taxMain()
    {
       getFilingStatus();
       getGrossIncome();
       getNumExemptions();
       final double taxRate = getTaxRate();
       final double incomeTaxOwed = processTaxes(taxRate);
       displayResults(taxRate, incomeTaxOwed);
    } // end taxMain
    
    /**
     * ask user for there filing status
     * @set filingStatus
     */
    public void getFilingStatus()
    {
        System.out.println("\nAre you (s)ingle, (m)arried, or (c)ohabiting?");
        System.out.print("Enter s, m, or c ==> ");
        filingStatus = stdIn.next().toLowerCase().charAt(0);
        
        // set allowed characters in List using indexOf to validate instead of using an if else
        List<Character> validOptions = Arrays.asList('s', 'm', 'c');
        if(validOptions.indexOf(filingStatus) < 0){
            // if invalid show error and reload function
            System.out.println("Invalid entry.");
            getFilingStatus();
        }
    } // end getFilingStatus
    
    /**
     * ask for gross income
     * @set grossIncome
     */
    public void getGrossIncome()
    {
        System.out.print("Gross income ==> ");
        grossIncome = stdIn.nextInt();
        
        if(grossIncome <= 0) {
            System.out.println("Invalid entry, must be more than zero!");
            getGrossIncome();
        }
    } // end getGrossIncome

    /**
     * ask for number of exemptions
     * @set numExemptions
     */
    public void getNumExemptions()
    {
        System.out.print("Number of Exemptions ==> ");
        numExemptions = stdIn.nextInt();
        
        if(numExemptions <= 0) {
            System.out.println("Invalid entry, must be more than zero!");
            getGrossIncome();
        }
    } // end getNumExemptions
    
    /**
     * get tax rate based on @param filingStatus, if filingStatus = c rate is 
     * based on @param grossIncome
     * @return taxRate
     */
    public double getTaxRate() {
        double taxRate = 0;
        switch(filingStatus) {
            case 's':
                taxRate = 0.2;
              break;
            case 'm':
                taxRate = 0.25;
              break;
            case 'c':
                taxRate = 0.1;
                if(grossIncome >= 20000 && grossIncome <= 50000) {
                    taxRate = 0.15;
                }
                else if(grossIncome > 50000) {
                    taxRate = 0.3;
                }
              break;
        } // end switch
        return taxRate;
    } // end processTax
    
    /**
     * set taxable income based on exemptions then calculate incomeTaxOwed
     * @set taxableIncome, incomeTaxOwed
     * @param taxRate
     * @return incomeTaxOwed
     */
    public double processTaxes(double taxRate)
    {
        // compute the income first then find the owed tax from the taxRate
        taxableIncome = grossIncome - (numExemptions * 1000);
        return (taxableIncome * taxRate);
    } // end processTaxes
    
    /**
     * display income tax summary
     * @param taxRate
     * @param incomeTaxOwed 
     */
    public void displayResults(double taxRate, double incomeTaxOwed)
    {
        // print out the resultsc
        
        System.out.println("\n─────────────────────");
        System.out.println("INCOME TAX SUMMARY");
        System.out.println("tax rate: " + (taxRate * 100) + "%");
        System.out.println("taxable income: " + taxableIncome);
        System.out.printf("taxes owed: $%.2f ",incomeTaxOwed);
        System.out.println("\n─────────────────────\n");

        processAnother();
    } // end displayResults

    /**
     * ask if user wants to process another
     */
    public void processAnother()
    {
        System.out.print("\nProcess another customer? (y/n): ");
        char processAnother = stdIn.next().toLowerCase().charAt(0);

        // set allowed characters in List using indexOf to validate instead of using an if else
        List<Character> validOptions = Arrays.asList('y', 'n');
        if(validOptions.indexOf(processAnother) < 0){
            processAnother(); // invalid entry
        }
        else if (processAnother == 'n') {
            System.exit(0); // end program
        }
        else if(processAnother == 'y') {
            taxMain(); // restart program
        }
    } // endprocessAnother
    
} // end class TaxRate
