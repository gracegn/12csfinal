import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class squareBG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class squareBG extends Actor
{
    public static int sCounter = 4;
    GreenfootImage squareBG = new GreenfootImage("squareBG.png");
    GreenfootImage squareBG2 = new GreenfootImage("squareBG2.png");
    GreenfootImage squareBG3 = new GreenfootImage("squareBG3.png");
    GreenfootImage squareBG4 = new GreenfootImage("squareBG4.png");
    
    //square acts as a piece of the mosaic in backgrounds, has different images that switch
    //when mouse ise clicked - also turns towards mouse location to create cool effect in mass
    public void act()
    {
        squareBG.setTransparency(200);
        squareBG2.setTransparency(200);
        squareBG3.setTransparency(200);
        squareBG4.setTransparency(200);
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null)
           turnTowards(mouse.getX(), mouse.getY());
        
        if(sCounter == 1)
            setImage(squareBG2);
        if(sCounter == 2)
            setImage(squareBG3);
        if(sCounter == 3)
            setImage(squareBG4);
        if(sCounter == 4)
            setImage(squareBG);
        
        
        
        if(Greenfoot.mousePressed(this))
        {
            if(sCounter == 4)
                sCounter = 1;
            else
                sCounter++;
        }
    }
}
