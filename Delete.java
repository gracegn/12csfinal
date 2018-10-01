import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Delete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Delete extends Actor
{
    public int heroArraySize;
    public int fArraySize;
    
    //acts as a button that calls methods to remove the 'latest' entered
    //button from both the array and the actual image from the screen
    public void act() 
    {
        Hero hero = (Hero) getWorld().getObjects(Hero.class).get(0);
        heroArraySize = hero.getArraySize();
        fArraySize = hero.fgetArraySize();
        if (Greenfoot.mousePressed(this))
        {
            hero.deleteFromArray();
            if(((levels)getWorld()).editF == false)
                ((levels)getWorld()).deleteButton(heroArraySize);
            else
                ((levels)getWorld()).deleteButton(fArraySize);
        }
    }
}
