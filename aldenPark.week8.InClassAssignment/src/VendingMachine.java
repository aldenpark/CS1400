/**
 * @filename: VendingMachine.java
 * @author: Alden Park
 * @date: 10/21/2017
 * @description: Week 8 homework Assignment
 */
import java.util.Scanner;

public class VendingMachine {
    private double paymentSum = 0;
    
    private void setPaymentSum(double sum)
    {
        this.paymentSum = sum;
    } // end setPaymentSum
    
    public double getPaymentSum()
    {
        return paymentSum;
    } // end getPaymentSum
    
    public void insertMoney()
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Amount of money inserted: ");
        if(!stdIn.hasNextDouble()) {
            System.out.println("Invalid payment. Must enter a positive number.");
        } else {
            setPaymentSum(stdIn.nextDouble());
        }
    } // end insertMoney
    
    public void selectItem()
    {
        if(getPaymentSum() == 0) {
            System.out.println("Sorry, you can't select, since you haven't inserted money yet.");
        }
        else {
            Scanner stdIn = new Scanner(System.in);
            double itemPrice = 0;
            
            System.out.print("Selected item's price: ");
            if(!stdIn.hasNextDouble()) {
                System.out.println("Invalid price. Must enter a positive number.");
            }
            else {
                itemPrice = stdIn.nextDouble();
            }
        
            if(itemPrice > getPaymentSum()) {
                System.out.println("Invalid selection. Price exceeds payment.");
            }
            else {
                double changeDue = itemPrice - getPaymentSum();
                int change = (int)(Math.ceil(changeDue*100));
                int dollars = Math.round((int)change/100);
                change = change%100;
                int quarters = Math.round((int)change/25) + (dollars*4);
                change = change%25;
                int dimes = Math.round((int)change/10);
                change = change%10;
                int nickels = Math.round((int)change/5);
                change = change%5;
                int pennies = Math.round((int)change/1);

                setPaymentSum(0);
                System.out.print("Your change is:\n"
                    + Math.abs(quarters) + " quarter(s)\n"
                    + Math.abs(dimes) + " dime(s)\n"
                    + Math.abs(nickels) + " nickle(s)\n"
                    + Math.abs(pennies) + " penny(ies)\n");                
            }
        }
    } // end selectItem
    
}
