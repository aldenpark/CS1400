/**
 * @filename: Sort.java
 * @author: Alden Park
 * @date: 10/24/2017
 * @description: Week 9 In Class Assignment
 */

/**
 * This class uses a selection sort to sort a single array.
 */
public class Sort {
    public static void sort(int[] list)
    {
        int j;
        for(int i=0; i<list.length-1; i++) {
            j = indexOfNextSmallest(list, i);
            swap(list, i, j);
        }        
    } // end sort
    
    private static int indexOfNextSmallest(int[] list, int startIndex)
    {
        int minIndex = startIndex;  // index of smallest value
        for(int i=startIndex+1; i<list.length; i++) {
            if(list[i] < list[minIndex]) {
                minIndex = i;
            }
        } // end for
        return minIndex;
    } // end indexOfNextSmallest
    
    private static void swap(int[] list, int i, int j)
    {
        int temp;       // temporary holder for number
        
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    } // end swap
} // end class Sort
