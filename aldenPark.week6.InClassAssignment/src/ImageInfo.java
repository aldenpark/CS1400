import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author Alden Park
 */
public class ImageInfo {
    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        ImageIcon icon;
        
        System.out.print("Enter image filename: ");
        icon = new ImageIcon(stdIn.nextLine());
        System.out.println("image width = " + icon.getIconWidth());
        System.out.println("image height = " + icon.getIconHeight());
    }
}