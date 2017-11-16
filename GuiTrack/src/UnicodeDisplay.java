import javax.swing.*;
import java.awt.Font;

/**
 * This prints unicode characters
 */
public class UnicodeDisplay {
    public static void main(String args[])
    {
        int[] codes = {'\u0391','\u0410','\u2200','\u2500','\u1700'};
        String[] descriptions = {"Greek", "Cyrillic (Russian)", "mathematical operators", "box drawing", "dingbats" };
        
        JFrame window = new JFrame("Some Unicode Characters");
        JTextArea area = new JTextArea();
        Font font = new Font(Font.DIALOG,Font.PLAIN, 12);
        
        window.setSize(600, 305); // pixel width, height
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(area);
        area.setFont(font);
        area.setLineWrap(true);
        area.append("Font type, style and size: " + font.getFontName() + ", " + font.getSize() + "\n");
        for(int i=0;i<codes.length;i++) {
            area.append("0x" + Integer.toString(codes[i], 16) + " " + descriptions[i] + ":\n");
            for(int j=0;j<=72;j++)
            {
                area.append((char) (codes[i] + j) + "  ");
            }
            area.append("\n");
        }
        window.setVisible(true);
    }
}
