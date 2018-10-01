import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class MenuInstructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuInstructions extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    
    private GreenfootImage image;
    private GreenfootImage imageHover;

    private boolean hovering;
    
    //text that changes colour when hovered over, the instructions on the menu screen
    public MenuInstructions() 
    {
        background = getImage();
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage imageHover = new GreenfootImage(background);
        
        GreenfootImage text = new GreenfootImage("INSTRUCTIONS", 72, Color.WHITE, transparent);
        GreenfootImage textHover = new GreenfootImage("INSTRUCTIONS", 72, Color.GRAY, transparent);

        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
            (image.getHeight()-text.getHeight())/2);
        imageHover.drawImage(textHover, (imageHover.getWidth()-text.getWidth())/2, 
            (imageHover.getHeight()-text.getHeight())/2);

        setImage(image);

        this.image = image;
        this.imageHover = imageHover;
    }
    
    //buttons returns player to instructions when clicked, and has hovering image
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new instruc());
        }
        
        if (Greenfoot.mouseMoved(null)) // mouse moved?
        {
            if (hovering != Greenfoot.mouseMoved(this)) // change in hover state?
            {
                hovering = ! hovering; // save change
                if (hovering) // hover begins?
                {
                    setImage(imageHover);
                }
                else
                    setImage(image);
            }
        }
    }
}
