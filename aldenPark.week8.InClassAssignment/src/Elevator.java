/**
 * @filename: Shirt.java
 * @author: Alden Park & --------
 * @date: 10/17/2017
 * @description: Week 8 in class Assignment
 */
import java.util.Scanner;

public class Elevator {
    private int floor = 1;
    
    private void setFloor(int floor)
    {
        this.floor = floor;
    } // end setFloor
    
    public int getFloor()
    {
        return floor;
    } // end getFloor
    
    private void displayFloor(int newFloor)
    {
        if(newFloor > getFloor()) {
            System.out.print("Going up..");
            for(int f = getFloor()+1; f <= newFloor; f++) {
                System.out.print(f+"..");
            }
        } else if(newFloor < getFloor()) {
            System.out.print("Going down..");
            for(int f = getFloor()-1; f >= newFloor; f--) {
                System.out.print(f+"..");
            }
        }
        System.out.println("Ding!");
        setFloor(newFloor);
    } // end selectFloor

    public void selectFloor()
    {
        Scanner stdIn = new Scanner(System.in);
        int floor = 0;
        boolean validSelection = false;
        System.out.print("Enter the floor that you'd like to go to ==> ");
        if(stdIn.hasNextInt()) {
            floor = stdIn.nextInt();
        }
        if(floor < 1 || floor > 100) {
            System.out.println("Invalid floor selection - must be between 1 and 100.");
            selectFloor();
        } else {
            displayFloor(floor);
        }
    } // end selectFloor
    
    public void fireAlarm()
    {
        System.out.println("Danger! You must exit the building now!");
        displayFloor(1);
    } // end fireAlarm
    
}
