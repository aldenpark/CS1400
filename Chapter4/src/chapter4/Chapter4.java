/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;
import java.util.Scanner;

/**
 *
 * @author Alden Park
 */
public class Chapter4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

//        for (int x = 10; x > 0; x--) {
//            System.out.print(x + " ");
//        }
//        System.out.print("Lift Off!");
        
//        int h = stdIn.nextInt();
//        int w = stdIn.nextInt();
//        
//        for (int x = 1;x <= h; x++) {
//            for (int y = 1;y < w; y++) {
//                System.out.print("<");
//            }
//            System.out.println("<");
//        }

//        int a = 3, b = 2;
//        double c = 5.0;
//
//        //Evaluate the expression:
//        System.out.print((c + a / b) / 8 * 2);

//            int grossNumber = stdIn.nextInt();

        int x = 15;
        x--;
        System.out.println(x);
        x %= 5;
        System.out.println(x);
            
        
    }
    
}
