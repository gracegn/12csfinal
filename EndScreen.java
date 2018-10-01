import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends Actor
{
    private int endCounter;
    
    // sets all the images
    private final GreenfootImage end1 = new GreenfootImage("End1.png");
    private final GreenfootImage end2 = new GreenfootImage("End2.png");
    private final GreenfootImage end3 = new GreenfootImage("End3.png");
    private final GreenfootImage end4 = new GreenfootImage("End4.png");
    private final GreenfootImage end5 = new GreenfootImage("End5.png");
    private final GreenfootImage end6 = new GreenfootImage("End6.png");
    private final GreenfootImage end7 = new GreenfootImage("End7.png");
    private final GreenfootImage end8 = new GreenfootImage("End8.png");
    private final GreenfootImage end9 = new GreenfootImage("End9.png");
    private final GreenfootImage end10 = new GreenfootImage("End10.png");
    private final GreenfootImage end11 = new GreenfootImage("End11.png");
    private final GreenfootImage end12 = new GreenfootImage("End12.png");
    private final GreenfootImage end13 = new GreenfootImage("End13.png");
    private final GreenfootImage end14 = new GreenfootImage("End14.png");
    private final GreenfootImage end15 = new GreenfootImage("End15.png");
    int delay = 20;
    
    //plays the image after a delay
    public void animateEnd()
    {
        if(endCounter <= delay * 1 )
        {
            setImage(end1);
            endCounter++;
        }
        if(endCounter > delay * 1 && endCounter <=delay * 2 )
        {
            setImage(end2);
            endCounter++;
        }
        if(endCounter > delay * 2 && endCounter <=delay * 3 )
        {
            setImage(end3);
            endCounter++;
        }
        if(endCounter > delay * 3 && endCounter <=delay * 4 )
        {
            setImage(end4);
            endCounter++;
        }
        if(endCounter > delay * 4 && endCounter <=delay * 5 )
        {
            setImage(end5);
            endCounter++;
        }
        if(endCounter > delay * 5 && endCounter <=delay * 6 )
        {
            setImage(end6);
            endCounter++;
        }
        if(endCounter > delay * 6 && endCounter <=delay * 7 )
        {
            setImage(end7);
            endCounter++;
        }
        if(endCounter > delay * 7 && endCounter <=delay * 8 )
        {
            setImage(end8);
            endCounter++;
        }
        if(endCounter > delay * 8 && endCounter <=delay * 9 )
        {
            setImage(end9);
            endCounter++;
        }
        if(endCounter > delay * 9 && endCounter <=delay * 10 )
        {
            setImage(end10);
            endCounter++;
        }
        if(endCounter > delay * 10 && endCounter <=delay * 11 )
        {
            setImage(end11);
            endCounter++;
        }
        if(endCounter > delay * 11 && endCounter <=delay * 12 )
        {
            setImage(end12);
            endCounter++;
        }
        if(endCounter > delay * 12 && endCounter <=delay * 13 )
        {
            setImage(end13);
            endCounter++;
        }
        if(endCounter > delay * 13 && endCounter <=delay * 14 )
        {
            setImage(end14);
            endCounter++;
        }
        if(endCounter > delay * 14 && endCounter <=delay * 15 )
        {
            setImage(end15);
            endCounter++;
        }
    }
    
    public void act() 
    {
        endCounter++;
        animateEnd();
    }    
}