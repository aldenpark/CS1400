package aldenPark.week6.InClassAssignment;

public class Rectangle {
    
    public final String ANSI_RESET = "\u001B[0m";
    public final String ANSI_BLACK = "\u001B[30m";
    public final String ANSI_RED = "\u001B[31m";
    public final String ANSI_GREEN = "\u001B[32m";
    public final String ANSI_YELLOW = "\u001B[33m";
    public final String ANSI_BLUE = "\u001B[34m";
    public final String ANSI_PURPLE = "\u001B[35m";
    public final String ANSI_CYAN = "\u001B[36m";
    public final String ANSI_WHITE = "\u001B[37m";
    
    private int length;
    private int width;
    private String Color;
    
    public boolean setColor(String c)
    {
        Color = ANSI_RESET;
        switch(c) {
            case "BLACK":
                Color = ANSI_BLACK;
              break;
            case "RED":
                Color = ANSI_RED;
              break;
            case "GREEN":
                Color = ANSI_GREEN;
              break;
            case "YELLOW":
                Color = ANSI_YELLOW;
              break;
            case "BLUE":
                Color = ANSI_BLUE;
              break;
            case "PURPLE":
                Color = ANSI_PURPLE;
              break;
            case "CYAN":
                Color = ANSI_CYAN;
              break;
            case "WHITE":
                Color = ANSI_WHITE;
              break;
        }
        return (!Color.equals(ANSI_RESET)) ? true : false;
    }
    
    public String getColor()
    {
        return Color;
    }
    
    public void setLength(int l)
    {
        length = l;
    }
    
    public void setWidth(int w)
    {
        width = w;
    }

    public int getLength()
    {
        return length;
    }
    
    public int getWidth()
    {
        return width;
    }

    public boolean isSquare() {
        return length == width;
    }
    
}
