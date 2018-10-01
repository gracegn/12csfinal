import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{
    private boolean playing = false;
    
    //if player clicks play, then sets playing to opposite aka will animate
    //the movements and steps in the array of the hero
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
            playing = !playing;
    }    
}
