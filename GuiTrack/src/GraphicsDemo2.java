
/**
 *
 * This darkens image around circular area of interest
 */

// Graphics, ImageIcon, Image, Graphipcs2d, Color, RadialGradientPaint, AlphaComposite, Font
import java.awt.*;
import javax.swing.*; // for Jframe, Jpanel
public class GraphicsDemo2 extends JPanel {
    public void paint(Graphics g)
    {
        ImageIcon icon = new ImageIcon("dolphins2.jpg");
        Image image = icon.getImage();
        Graphics2D g2 = (Graphics2D) g.create();
        float centerX = 340;
        float centerY = 240;
        float radius = 300;
        float[] gradientRange = {0.7f, 1.0f};       // time radius
        // Color components are: red, green, blue & opaqueness
        // in the range between 0.0f and 1.0f
        Color insideColor = new Color(0.0f, 0.0f, 0.0f, 0.0f);
        Color outsideColor = Color.BLACK;
        Color[] colors = {insideColor, outsideColor};
        
        super.paint(g);                             // preserve background
        
        g.drawImage(image, 0, 0, 680, 480,         // destination topL, botR
            0, 0, 2306, 1625, this);               // source TopL, botR
        
        // next section for tinted pane
        g2.setPaint(new RadialGradientPaint(
            centerX, centerY, radius, gradientRange, colors));
        g2.setComposite(AlphaComposite.getInstance(
            AlphaComposite.SRC_OVER, 0.5f));
        g2.fillRect(0, 0, getWidth(), getHeight());
        
        // next section for text
        g.setColor(Color.WHITE);
        g.setFont(new Font(Font.SERIF, Font.ITALIC, 20));
        
        g.drawString("CAIDEN", 435, 470);
    }
}
