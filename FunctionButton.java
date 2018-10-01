import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FunctionButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FunctionButton extends Actor
{
    private final int DISTANCE = 60;
    public int heroArraySize;
    public final int HMAXSIZE = 11;
    public int fArraySize;
    public final int FMAXSIZE = 7;

    //acts as button to add a function button to the movement array and to the actual screen if clicked
    public void act() 
    {
        Hero hero = (Hero) getWorld().getObjects(Hero.class).get(0);
        heroArraySize = hero.getArraySize();
        fArraySize = hero.fgetArraySize();
        if (Greenfoot.mousePressed(this))
        {
            if(((levels)getWorld()).editF == false && heroArraySize < HMAXSIZE)
            {
                hero.setArray("func");
                ((levels)getWorld()).addButton("func", setCount());
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