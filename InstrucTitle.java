import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class InstrucTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstrucTitle extends Actor
{
    //acts as text
    public void act() 
    {
        Color c = new Color(0,0,0,0);
        setImage(new GreenfootImage("Instructions", 110, Color.WHITE, c));
    }    
}
