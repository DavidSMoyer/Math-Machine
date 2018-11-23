import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    // The image used to display text.
    private GreenfootImage img;
    /**
     * Constructor for the class. Creates text anywhere in the world.
     * 
     * @param text The text to be displayed.
     * @param fontSize The size of the font.
     * @param color The color of the text.
     * @return Returns nothing.
     */
    public Text(String text,int fontSize,Color color)
    {
        img = new GreenfootImage(text.length()*fontSize,fontSize*2);
        img.setFont(new Font("Helvetica",fontSize));
        img.setColor(color);
        img.drawString(text,0,fontSize);
        setImage(img);
    }
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
