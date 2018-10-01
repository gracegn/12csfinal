import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instruc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class instruc extends World
{

    /**
     * Constructor for objects of class instruc.
     * 
     */
    public instruc()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
    }
    
    public void prepare()
    {
        BackMenu backmenu = new BackMenu("white");
        addObject(backmenu,40,25);

        LevelSelectButton levelselectbutton = new LevelSelectButton("white");
        addObject(levelselectbutton,150,25);

        InstructText instructtext = new InstructText();
        addObject(instructtext, 503, 405);
        
        InstrucTitle instructitle = new InstrucTitle();
        addObject(instructitle, 503, 150);
        
        labeledExampleClick clickclick = new labeledExampleClick("black");
        addObject(clickclick,500,625);
    }
}
