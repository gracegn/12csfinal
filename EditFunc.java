import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EditFunc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EditFunc extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    
    private GreenfootImage image;
    private GreenfootImage clicked;
    
    //editF button on all levels
    public EditFunc() 
    {
        background = getImage();
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage clicked = new GreenfootImage(background);
        
        GreenfootImage text = new GreenfootImage("Edit F", 28, Color.BLACK, transparent);
        GreenfootImage clickedtext = new GreenfootImage("Edit F", 28, Color.WHITE, transparent);
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, (image.getHeight()-text.getHeight())/2);
        clicked.drawImage(clickedtext, (image.getWidth()-text.getWidth())/2, (image.getHeight()-text.getHeight())/2);
        
        setImage(image);

        this.image = image;
        this.clicked = clicked;
    }
    
    //when clicked, will set editF to opposite to let program know if player
    //is editing the function right now or the main input
    public void act()
    {
        if (Greenfoot.mousePressed(this) && ((levels)getWorld()).editF == false)
        {
            setImage(clicked);
            ((levels)getWorld()).setEditF();
        }
        else if (Greenfoot.mousePressed(this) && ((levels)getWorld()).editF == true)
        {
            setImage(image);
            ((levels)getWorld()).setEditF();
        }
    }
}
