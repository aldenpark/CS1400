
import java.util.Scanner;


/**
 *
 * @author Alden Park
 */
public class Pets2 {
    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        Object obj;
        
        System.out.print("Which type of pet do you prefere?\n" + 
                "Enter d for dogs or c for cats: ");
        if(stdIn.next().equals("d")) {
            obj = new Dog();
        }
        else {
            obj = new Cat();
        }
        if(obj instanceof Dog) {
            System.out.println("Wag tail");
        }
    }
}
