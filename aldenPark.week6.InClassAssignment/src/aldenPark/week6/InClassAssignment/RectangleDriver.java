package aldenPark.week6.InClassAssignment;
import java.util.Scanner;

public interface RectangleDriver {
    
    public final String ANSI_RESET = "\u001B[0m";
    public final String ANSI_CYAN = "\u001B[36m";
    
    public static void main(String args[])
    {
        
        Scanner stdIn = new Scanner(System.in);
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle();
        
        String Color = ANSI_RESET;
        
        // Start getting rect1
        System.out.print("\n"+ANSI_RESET+"Enter a color: ");
        if(stdIn.hasNext()){
            if(!rect1.setColor(stdIn.next().toUpperCase())) {
                System.out.println("\nColor not found, using default!");
            }
            Color = rect1.getColor();
        }
        
        System.out.print("\n"+Color+"Enter the width of rectangle 1: ");
        if(stdIn.hasNextInt()){
            rect1.setWidth(stdIn.nextInt());
        }

        System.out.print(Color+"Enter the length of rectangle 1: ");
        if(stdIn.hasNextInt()){
            rect1.setLength(stdIn.nextInt());
        }
        
        // result of rect1
        System.out.println(Color+"Width: "+rect1.getWidth());
        System.out.println(Color+"Length: "+rect1.getLength());
        
        if(rect1.isSquare()){
            System.out.print(Color+"Square: ");
        }
        else {
            System.out.print(Color+"Rectangle: ");
        }
        System.out.print(rect1.getWidth() + " X " + rect1.getLength() + "\n");

        // Start getting rect2
        System.out.print("\n"+ANSI_RESET+"Enter a color: ");
        if(stdIn.hasNext()){
            if(!rect2.setColor(stdIn.next().toUpperCase())) {
                System.out.println("\nColor not found, using default!");
            }
            Color = rect2.getColor();
        }
        
        System.out.print("\n"+Color+"Enter the width of rectangle 2: ");
        if(stdIn.hasNextInt()){
            rect2.setWidth(stdIn.nextInt());
        }

        System.out.print(Color+"Enter the length of rectangle 2: ");
        if(stdIn.hasNextInt()){
            rect2.setLength(stdIn.nextInt());
        }
        
        // result of rect2
        System.out.println(Color+"Width: "+rect2.getWidth());
        System.out.println(Color+"Length: "+rect2.getLength());
        
        System.out.print(Color+"Square: ");
        if(rect2.isSquare()){
        }
        else {
            System.out.print(Color+"Rectangle: ");
        }
        System.out.print(rect2.getWidth() + " X " + rect2.getLength() + "\n");
        
        // Start getting rect3
        System.out.print("\n"+ANSI_RESET+"Enter a color: ");
        if(stdIn.hasNext()){
            if(!rect3.setColor(stdIn.next().toUpperCase())) {
                System.out.println("\nColor not found, using default!");
            }
            Color = rect3.getColor();
        }
        
        System.out.print("\n"+Color+"Enter the width of rectangle 3: ");
        if(stdIn.hasNextInt()){
            rect3.setWidth(stdIn.nextInt());
        }

        System.out.print(Color+"Enter the length of rectangle 3: ");
        if(stdIn.hasNextInt()){
            rect3.setLength(stdIn.nextInt());
        }
        
        // result of rect3
        System.out.println(Color+"Width: "+rect3.getWidth());
        System.out.println(Color+"Length: "+rect3.getLength());
        
        if(rect3.isSquare()){
            System.out.print(Color+"Square: ");
        }
        else {
            System.out.print(Color+"Rectangle: ");
        }
        System.out.print(rect3.getWidth() + " X " + rect3.getLength() + "\n");
        
    }
    
}
