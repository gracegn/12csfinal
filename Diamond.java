import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond extends Actor
{
    public void act() 
    {
        
    }
    
    //if collected, will call countcatch method aka change the diamond counter, and remove itself
    //from the screen
    public void caught()
    {
        //Greenfoot.playSound("pop.wav");
        ((levels)getWorld()).countCatch();
        getWorld().removeObject(this);
    }
}
