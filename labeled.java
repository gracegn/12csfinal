import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class labeled here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class labeled extends World
{

    /**
     * Constructor for objects of class labeled.
     * 
     */
    public labeled()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
    }
    
    public void prepare()
    {
        labeledExample labeledexample = new labeledExample();
        addObject(labeledexample,500,335);

        BackMenu backmenu = new BackMenu("black");
        addObject(backmenu,375,675);

        Instructions instructions = new Instructions("black");
        addObject(instructions,480,675);

        LevelSelectButton levelselectbutton = new LevelSelectButton("black");
        addObject(levelselectbutton,620,675);
    }
}
