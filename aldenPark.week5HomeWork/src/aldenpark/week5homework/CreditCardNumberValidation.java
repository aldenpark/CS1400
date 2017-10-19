package aldenpark.week5homework;
import java.util.Scanner;

/**
 * @filename: CreditCardNumberValidation.java
 * @author: Alden Park
 * @dueDate: 10/07/2017
 * @description: Week 5 Homework
 */
public class CreditCardNumberValidation {
       
    public static void main(String[] args)
    {
        final Scanner stdIn = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer:");
        
        if(stdIn.hasNextLong()){
            final long number = stdIn.nextLong();
            
            System.out.println(number + " is " + 
                (isValid(number) ? "valid" : "invalid"));
        } else {
            System.out.println("Invalid characters entered, quiting!");
        }
        
    } // end method main()
    
    /** Return true if the card number is valid
     * 
     * 4 for Visa cards
     * 5 for Master cards
     * 37 for American Express cards
     * 6 for Discoverer cards 
     * 
     * @param number
     * @return boolean
     */
    public static boolean isValid(long number)
    {
        final boolean valid =
                (getSize(number) >= 13 && getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                prefixMatched(number, 6) || prefixMatched(number, 37)) &&
                ((sumOfDoublesEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

        return valid;
    } // end method isValid()
    
    /** Return the result of step 2
     * 
     * @param number
     * @return integer
     */
    public static int sumOfDoublesEvenPlace(long number)
    {
        int sum = 0;
        final String num = String.valueOf(number);
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(String.valueOf(num.charAt(i))) * 2);
        }
        return sum;
    } // end method sumOfDoublesEvenPlace()
    
    /** Return this number if it is a single digit, otherwise
     * return the sum of the two digits
     * 
     * @param number
     * @return integer
     */
    public static int getDigit(int number)
    {
        return (number < 9) ? number : number / 10 + number % 10;
    } // end method getDigit()
    
    /** Return sum of odd-place digits in number
     * 
     * @param number
     * @return integer
     */
    public static int sumOfOddPlace(long number)
    {
        int sum = 0;
        final String num = String.valueOf(number);
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return sum;
    } // end method sumOfOddPlace()
    
    /** Return true if the number d is a prefix of the number
     * 
     * @param number
     * @param d
     * @return boolean
     */
    public static boolean prefixMatched(long number, int d)
    {
        return getPrefix(number, getSize(d)) == d;
    } // end method prefixMatched()
    
    /** Return the number of digits in d
     * 
     * @param d
     * @return integer
     */
    public static int getSize(long d)
    {
        final String num = String.valueOf(d);
        return num.length();
    } // end method getSize()
    
    /** Return the first k number of digits from the number.
     * If the number of digits in number is less than k, return number
     * 
     * @param number
     * @param k
     * @return long
     */
    public static long getPrefix(long number, int k)
    {
        if (getSize(number) > k)  {
            final String num = String.valueOf(number);
            return  Long.parseLong(num.substring(0, k));
        }
        return number;
    } // end method getPrefix()
    
} // end CreditCardNumberValidation class
