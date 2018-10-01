import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class LevelSelectButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelectButton extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    
    private GreenfootImage image;
    private GreenfootImage imageHover;

    private boolean hovering;
    
    // SETTING UP THE TEXT
    public LevelSelectButton(String colour) 
    {
        background = getImage();
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage imageHover = new GreenfootImage(background);

        GreenfootImage text;
        if(colour.equals("white"))
            text = new GreenfootImage("Level Select", 24, Color.WHITE, transparent);
        else if(colour.equals("black"))
            text = new GreenfootImage("Level Select", 24, Color.BLACK, transparent);
        else
            text = new GreenfootImage("Level Select", 24, Color.GRAY, transparent);
            
        GreenfootImage textHover = new GreenfootImage("Level Select", 24, Color.GRAY, transparent);

        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
            (image.getHeight()-text.getHeight())/2);
        imageHover.drawImage(textHover, (imageHover.getWidth()-text.getWidth())/2, 
            (imageHover.getHeight()-text.getHeight())/2);

        setImage(image);

        this.image = image;
        this.imageHover = imageHover;
    }
    
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new levelSelect());
        }
        
        // CHANGE COLOUR OF THE BUTTON
        if (Greenfoot.mouseMoved(null)) // mouse moved
        {
            if (hovering != Greenfoot.mouseMoved(this)) // change in hover state?
            {
                hovering = ! hovering; // save change
                if (hovering) // hover begins
                {
                    setImage(imageHover);
                }
                else
                    setImage(image);
            }
        }
    }
}
