/**
 * @filename: SortDriver.java
 * @author: Alden Park
 * @date: 10/24/2017
 * @description: Week 9 In Class Assignment
 */

/**
 * This exercises selection sort in class Sort
 */
public class SortDriver {
    public static void main(String args[])
    {
        int[] studentIds = {3333, 1234, 2222, 1000};
        
        Sort.sort(studentIds);
        for(int i=0;i<studentIds.length; i++) {
            System.out.print(studentIds[i] + " ");
        }
    } // end main
} // end SortDriver
