/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;
import java.util.Collections;
/**
 *
 * @author Alden Park
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "-";
        final String LINE_CAL = String.join("", Collections.nCopies(100, s));
        final String LINE_MONTH_YEAR = "/n /n"; // show month and year

        final String SUN_SAT_CAL = "/n /n"; // show month and year
        
        final String DAY_CAL = "%-15s %15s %n"; // show date: | num
        int days = 29;
        int current = days;
        // print month/year
        while(current >= 0) {
            
            // print week
            for(int b=0; b<=7; b++)
            {
                System.out.printf(DAY_CAL, "|", current);
                // print Date 
            }
            System.out.print("|");
            current --;
        }
         //System.out.printf("%25s", String. Collections.nCopies("-"));
        //System.out.printf("", );
    }
    
}
