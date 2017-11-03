/**
 * @filename: DrivewayParking.java
 * @author: Alden Park
 * @date: 11/02/2017
 * @description: Week 10 In Class Assignment
 */

import java.util.ArrayDeque;
import java.util.Scanner;


/**
 * This program uses stacks to help with a driveway parking service.
 */
public class DrivewayParking {
    private ArrayDeque<String> driveway1 = new ArrayDeque<>();
    private ArrayDeque<String> driveway2 = new ArrayDeque<>();
    
    public void describeDriveways()
    {
        System.out.println("driveway1 " + driveway1);
        System.out.println("driveway2 " + driveway2);
    } // end describeDriveways
    
    // This method parks a car in the least full driveway.
    private void parkCar(String licensePlate)
    {
        if(driveway1.size() <= driveway2.size()) {
            driveway1.push(licensePlate);
        }
        else {
            driveway2.push(licensePlate);
        }
    } // end parkCar
    
    // Return true if and only if licensePlate is found
    private boolean getCar(String licensePlate)
    {
        String otherPlate;
        if(driveway1.contains(licensePlate)) {
            otherPlate = driveway1.pop();
            while(!otherPlate.equals(licensePlate)) {
                driveway2.push(otherPlate);
                otherPlate = driveway1.pop();
            }
            return true;
        }
        else if(driveway2.contains(licensePlate)) {
            otherPlate = driveway2.pop();
            while(!otherPlate.equals(licensePlate)) {
                driveway1.push(otherPlate);
                otherPlate = driveway2.pop();
            }
            return true;
        }
        else {
            return false;
        }
    } // end getCar
    
    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        char action;
        String licensePlate;
        DrivewayParking attendant = new DrivewayParking();
        
        do {
            attendant.describeDriveways();
            System.out.print("Enter +license to add, -license to remove, or q to quit: ");
            licensePlate = stdIn.nextLine();
            action = licensePlate.charAt(0);
            licensePlate = licensePlate.substring(1);
            switch(action) {
                case '+':
                    attendant.parkCar(licensePlate);
                  break;
                case '-':
                    if(!attendant.getCar(licensePlate)) {
                        System.out.println("Sorry, couldn't fint it.");
                    }
            } // end switch
        } while(action != 'q');
    } // end main
} // end class DrivewayParking
