import java.awt.*;
import javax.swing.JApplet;

/**
 *
 * @author Alden Park
 */
public class GraphicsDemo extends JApplet {
    public void paint(Graphics g)
    {
        Image image = this.getImage(getDocumentBase(), "test.jpg");
        
        // display smaller complete image in upper left corner of window
        g.drawImage(image, 0, 0, 427, 284,          // destination topL, botR
                0, 0, 864, 576, this);              // source topL, botR
        
        // establish color of all lines to be drawn
        g.setColor(Color.GREEN);
        
        // draw rectabgke ariybd reuib it be expanded
        g.drawRect(214, 72, 107, 168);              // topL, width & height
        
        // draw lines between corners of rectangles
        g.drawLine(214, 72, 304, 235);              // upper left
        g.drawLine(321, 72, 565, 235);              // upper right
        g.drawLine(214, 240, 304, 646);             // lower left
        g.drawLine(321, 240, 566, 646);             // lower right
        
        // display expanded part of original image
        g.drawImage(image, 304, 235, 565, 646,      // destination topL, botR
                432, 145, 650, 487, this);          // source, topL, botR
        
        g.drawRect(304, 235, 261, 411);             // topL, width & height
        
        // create GREEN colored oval and write name on it
        g.fillOval(400, 390, 70, 30);               // topL, width & height
        g.setColor(Color.WHITE);                    // chnage color for text
        g.drawString("JORDAN", 410, 410);           // string & start position
    } // end paint
}
