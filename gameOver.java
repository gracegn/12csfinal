import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends World
{
    private int prevLevel;
    
    public gameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        prevLevel = 1;
        prepare();
    }
    
    public gameOver(int lvl)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        prevLevel = lvl;
        prepare();
    }
    
    public void prepare()
    {
        Text text = new Text("Press Enter to RETRY level");
        addObject(text,500,550);
        
        BackMenu backmenu = new BackMenu("white");
        addObject(backmenu,370,675);

        Instructions instructions = new Instructions("white");
        addObject(instructions,480,675);
        
        LevelSelectButton levelselectbutton = new LevelSelectButton("white");
        addObject(levelselectbutton,615,675);
        
        EndScreen endscreen = new EndScreen();
        addObject(endscreen, 500, 300);
    }
    
    //sets screen back to previous level, (passed through constructor)
    public void act()
    {
        if(Greenfoot.isKeyDown("enter") & prevLevel == 1)
            Greenfoot.setWorld(new one());
        if(Greenfoot.isKeyDown("enter") & prevLevel == 2)
            Greenfoot.setWorld(new two());
        if(Greenfoot.isKeyDown("enter") & prevLevel == 3)
            Greenfoot.setWorld(new three());
        if(Greenfoot.isKeyDown("enter") & prevLevel == 4)
            Greenfoot.setWorld(new four());
        if(Greenfoot.isKeyDown("enter") & prevLevel == 5)
            Greenfoot.setWorld(new five());
    }
}
