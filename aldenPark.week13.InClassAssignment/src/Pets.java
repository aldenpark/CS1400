
import java.util.Scanner;


/**
 *
 * @author Alden Park
 */
public class Pets {
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
        System.out.println(obj.toString());
        System.out.println(obj);
    }
}
