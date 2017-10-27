/**
 * @filename: VowelCounter.java
 * @author: Alden Park
 * @date: 10/24/2017
 * @description: Week 9 In Class Assignment
 */

/**
 * This class count upper and lower case vowels.
 */
public class VowelCounter {
    private final char[] vowelCounter = {'A', 'E', 'I', 'O', 'U', 'Y'};
    private int[][] vowelCount;
    
    public VowelCounter() {
        vowelCount = new int[vowelCounter.length][2];
    } // end construct
    
    /**
     * This method receives a line of text as a parameter and uses it to update the vowel counts appropriately
     */
    public void processLine(String lineOfChars) {
        int i;
        for(String c : lineOfChars.split("")) {
            i = 0;
            for(char v : vowelCounter) {
                if(c.charAt(0) == v) {
                    vowelCount[i][1]++;
                }
                else if(c.charAt(0) == Character.toLowerCase(v)) {
                    vowelCount[i][0]++;
                }
                i++;
            }
        }
    } // end processLine

    /**
     * This method prints a summary of the counts for all vowels entered.
     */
    public void printSummary() {
        for(int i=0;i<vowelCounter.length;i++) {
            System.out.println(vowelCounter[i] + ": " + 
                    vowelCount[i][0] + " lowercase, " + 
                    vowelCount[i][1] + " uppercase, " + 
                    (vowelCount[i][0] + vowelCount[i][1]) + " total");
        }
    } // end printSummary
} // end class VowelCounter
