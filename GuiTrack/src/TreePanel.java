import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * This displays growing trees
 * @author Alden Park
 */
public class TreePanel extends JPanel{
    private final int HEIGHT;                           // height of frame
    private final int WIDTH;                            // width of frame
    private ArrayList<Tree> trees = new ArrayList<>();
    private int time = 0;                               // in months
    
    public TreePanel(int frameHeight, int frameWidth)
    {
        HEIGHT = frameHeight;
        WIDTH = frameWidth;
    } // end construct
    
    public void setTime(int time)
    {
        this.time = time;
    }
    
    public void addTree(int location, double trunkLenght, int plantTime)
    {
        trees.add(new Tree(location, plantTime, trunkLenght));
    }
    
    public ArrayList<Tree> getTrees()
    {
        return trees;
    }
    
    public void paintComponent(Graphics g)
    {
        int location;                                   // horizonal starting position of a tree
        String age;                                     // age of a tree in years
        
        super.paintComponent(g);
        // draw a horizonal line representing surface of the earth
        g.drawLine(25, HEIGHT - 75, WIDTH - 35, HEIGHT - 75);;
        for(Tree tree: trees) {
            // draw the current tree
            location = tree.getStartX();
            tree.drawBranches(g, location, HEIGHT - 75, tree.getTrunkLength(), 90);
            // write the age of the current tree
            age = Integer.toString((time - tree.getStartTime()) / 12);
            g.drawString(age, location - 5, HEIGHT - 50);
        }
    }
}
