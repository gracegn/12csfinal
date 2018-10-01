import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private String words;
    
    //generic text image
    public Text(String words) 
    {
        this.words = words;
        background = getImage();
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(words, 48, Color.GRAY, transparent);
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }    
}
