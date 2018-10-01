import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.*;
/**
 * Write a description of class Left here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Left extends Actor
{
    private final int DISTANCE = 60; //distance between each button
    public int heroArraySize;
    public final int HMAXSIZE = 11;
    public int fArraySize;
    public final int FMAXSIZE = 7;

    //acts as button to add a left to the movement array and to the actual screen if clicked
    public void act() 
    {
        Hero hero = (Hero) getWorld().getObjects(Hero.class).get(0);
        heroArraySize = hero.getArraySize();
        fArraySize = hero.fgetArraySize();
        if (Greenfoot.mousePressed(this))
        {
            if((((levels)getWorld()).editF == false && heroArraySize < HMAXSIZE) || (((levels)getWorld()).editF == true && fArraySize < FMAXSIZE))
            {
                hero.setArray("left");
                ((levels)getWorld()).addButton("left", setCount());
            }
        }
    }   

    //returns a distance/location to set the next button depending on current array size
    public int setCount()
    {
        if( ((levels)getWorld()).editF == false)
            return (heroArraySize-1)*DISTANCE;
        else
            return(fArraySize-1)*DISTANCE;
    }
}
