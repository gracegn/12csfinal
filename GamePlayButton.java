import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GamePlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GamePlayButton extends Actor
{
    public void act()
    {
        // if the button is clicked, level select will open
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new levelSelect());
        }
    }   
}
