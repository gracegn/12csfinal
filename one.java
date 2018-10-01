import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.*;
/**
 * Write a description of class one here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class one extends levels
{
    //4 MOVES NEEDED, F F F F
    public static Counter counter = new Counter("Diamonds Left: ");
    public static boolean collected = false;
    public final String initialDirection = "Rforwards";
    
    public one()
    {    
        super();
        counter.setValue(3);
        prepare();
    }
    
    //changes counter value whenever a diamond is gotten, sets collected to true if all are gone
    public void countCatch()
    {
        counter.add(-1);
        if(counter.getValue() == 0)
            collected = true;
    }
    
    //returns whether or not all diamonds are collected
    public boolean collectedOrNot()
    {
        return collected;
    }
    
    private void prepare()
    {
        //Set Counter
        addObject(counter, 905, 25);

        BackMenu backmenu = new BackMenu("white");
        addObject(backmenu,40,25);

        Instructions instructions = new Instructions("white");
        addObject(instructions,150,25);

        LevelSelectButton levelselectbutton = new LevelSelectButton("white");
        addObject(levelselectbutton,285,25);

        //to move from one platform to another, hero must go x+55, y-20
        //Set Platforms
        Platform Platform1 = new Platform();
        addObject(Platform1,390, 330);

        Platform Platform2 = new Platform();
        addObject(Platform2,445, 350);

        Platform Platform3 = new Platform();
        addObject(Platform3,500, 370);

        Platform Platform4 = new Platform();
        addObject(Platform4,555, 390);

        Platform Platform5 = new Platform();
        addObject(Platform5,610, 410);

        Objective objective = new Objective();
        addObject(objective, 610, 375);

        //Set hero
        ArrayList<String> movement = new ArrayList<String>();
        ArrayList<String> func = new ArrayList<String>();
        Hero hero = new Hero(movement, func, initialDirection);
        addObject(hero,390, 275);

        //Set Diamonds
        Diamond Diamond1 = new Diamond();
        addObject(Diamond1,445, 300);

        Diamond Diamond2 = new Diamond();
        addObject(Diamond2,500, 320);

        Diamond Diamond3 = new Diamond();
        addObject(Diamond3,555, 340);

        //Set input
        Input input = new Input();
        addObject(input,409,640);

        FunctionInput functioninput = new FunctionInput();
        addObject(functioninput,950,315);

        //Set others
        Left left = new Left();
        addObject(left,888,640);

        Right right = new Right();
        addObject(right,950,640);

        Forwards forwards = new Forwards();
        addObject(forwards,830,640);

        PlayButton playbutton = new PlayButton();
        addObject(playbutton, 40, 639);

        Delete delete = new Delete();
        addObject(delete,775,640);

        FunctionButton functionButton = new FunctionButton();
        addObject(functionButton, 950, 575);

        EditFunc editfunc = new EditFunc();
        addObject(editfunc,950,70);

        //add Platform FRONT LEFT: x-55, y+20
        //add Platform FRONT RIGHT: x+55, y+20
        //add Platform IN FRONT: x, y+40
        //add Diamond on top: x, y-50
        //add hero on top: x, y-55
        //add Objective on a platform: same x, y-70
    }
    
    //when hero does the wrong moves aka doesn't win, we reset everything
    //so this resets and re-adds the hero to the original spot
    public void resetHero(ArrayList<String> movement, ArrayList<String> func)
    {
        Hero hero2 = new Hero(movement, func, initialDirection);
        addObject(hero2,390, 275);
    }
    
    //when hero does the wrong moves aka doesn't win, we reset everything
    //so this resets and re-adds all the diamonds to the original spots
    public void resetDiamonds()
    {
        removeObjects(getObjects(Diamond.class));
        counter.setValue(3);
        
        Diamond Diamond1 = new Diamond();
        addObject(Diamond1,445, 300);

        Diamond Diamond2 = new Diamond();
        addObject(Diamond2,500, 320);

        Diamond Diamond3 = new Diamond();
        addObject(Diamond3,555, 340);
    }
    
    //essentially checks if the hero has ended up on a platform at the end of a
    //movement or step, if it is then it'll return true, it not, false
    public boolean checkOn(int xlocation, int ylocation)
    {
        //TRUE MEANS ON, FALSE MEANS OFF
        //to move from one platform to another, hero must go x+55, y-20
        if ((xlocation == 390 && ylocation == 330-55) || (xlocation == 445 && ylocation == 350-55) || 
        (xlocation == 500 && ylocation == 370-55) || (xlocation == 555 && ylocation == 390-55) || 
        (xlocation == 610 && ylocation == 410-55) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
