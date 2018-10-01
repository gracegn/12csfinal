import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {
        super(1000, 700, 1);
        prepare();
    }

    private void prepare()
    {
        MenuInstructions menuInstructions = new MenuInstructions();
        addObject(menuInstructions,500,317);

        Title title = new Title();
        addObject(title,500,213);

        GamePlayButton gameplaybutton = new GamePlayButton();
        addObject(gameplaybutton,500,450);
    }
}
