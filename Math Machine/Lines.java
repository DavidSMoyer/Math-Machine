import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lines extends Actor
{
    // The image created to draw the lines.
    private GreenfootImage img = new GreenfootImage(400,500);
    /**
     * The constructor of the class. Draws a line between two points in the world.
     * 
     * @param x1 The first X coordinate.
     * @param y1 The first Y coordinate.
     * @param x2 The second X coordinate.
     * @param y2 The second Y coordinate.
     * @return Returns nothing.
     */
    public Lines(int x1,int y1,int x2,int y2)
    {
        img.setColor(Color.BLACK);
        img.drawLine(x1,y1,x2,y2);
        setImage(img);
    }
    /**
     * Act - do whatever the Lines wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
