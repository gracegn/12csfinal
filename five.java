import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.*;
/**
 * Write a description of class five here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class five extends levels
{
    //IF LOOPS, 17 MOVES, P1 P1 L P1 P1 L P1 P1 L P1 P1, P1: F F R F F R
    public static Counter counter = new Counter("Diamonds Left: ");
    public static boolean collected = false;
    public final String initialDirection = "Rforwards";
    
    public five()
    {    
        super();
        counter.setValue(12);
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
        addObject(counter, 898, 25);
        
        BackMenu backmenu = new BackMenu("white");
        addObject(backmenu,40,25);
        
        Instructions instructions = new Instructions("white");
        addObject(instructions,150,25);
        
        LevelSelectButton levelselectbutton = new LevelSelectButton("white");
        addObject(levelselectbutton,285,25);
        
        //Set Platforms
        Platform Platform1 = new Platform();
        addObject(Platform1,500, 250);  //1

        Platform Platform2 = new Platform();
        addObject(Platform2,445, 270);  //2

        Platform Platform3 = new Platform();
        addObject(Platform3,555, 270);  //3

        Platform Platform4 = new Platform();
        addObject(Platform4,390, 290);  //4

        Platform Platform5 = new Platform();
        addObject(Platform5,610, 290);  //5

        Platform Platform6 = new Platform();
        addObject(Platform6,335, 310);  
        
        Platform Platform7 = new Platform();
        addObject(Platform7,445, 310);
        
        Platform Platform8 = new Platform();
        addObject(Platform8,555, 310);  //6
        
        Platform Platform9 = new Platform();
        addObject(Platform9,665, 310);
        
        Platform Platform10 = new Platform();
        addObject(Platform10,280, 330);
        
        //center
        Platform Platform11 = new Platform();
        addObject(Platform11,500, 330);  //7

        Platform Platform12 = new Platform();
        addObject(Platform12,720, 330);
        
        Platform Platform13 = new Platform();
        addObject(Platform13,335, 350);

        Platform Platform14 = new Platform();
        addObject(Platform14,445, 350);  //8

        Platform Platform15 = new Platform();
        addObject(Platform15,555, 350);  //9

        Platform Platform16 = new Platform();
        addObject(Platform16,665, 350);

        Platform Platform17 = new Platform();
        addObject(Platform17,390, 370);  //10

        Platform Platform18 = new Platform();
        addObject(Platform18,610, 370);  //11

        Platform Platform19 = new Platform();
        addObject(Platform19,445, 390);  //12

        Platform Platform20 = new Platform();
        addObject(Platform20,555, 390);  //13
        
        Platform Platform21 = new Platform();
        addObject(Platform21,500, 410);  //14
        
        Objective objective = new Objective();
        addObject(objective,500,295);
        
        //Set hero
        ArrayList<String> movement = new ArrayList<String>();
        ArrayList<String> func = new ArrayList<String>();
        Hero hero = new Hero(movement, func, initialDirection);
        addObject(hero,500, 275);

        //Set Diamonds
        Diamond Diamond1 = new Diamond();
        addObject(Diamond1,445, 220);

        Diamond Diamond2 = new Diamond();
        addObject(Diamond2,555, 220);

        Diamond Diamond3 = new Diamond();
        addObject(Diamond3,335, 260);
        
        Diamond Diamond4 = new Diamond();
        addObject(Diamond4,445, 260);

        Diamond Diamond5 = new Diamond();
        addObject(Diamond5,555, 260);

        Diamond Diamond6 = new Diamond();
        addObject(Diamond6,665, 260);
        
        Diamond Diamond7 = new Diamond();
        addObject(Diamond7,335, 300);

        Diamond Diamond8 = new Diamond();
        addObject(Diamond8,445, 300);

        Diamond Diamond9 = new Diamond();
        addObject(Diamond9,555, 300);
        
        Diamond Diamond10 = new Diamond();
        addObject(Diamond10,665, 300);

        Diamond Diamond11 = new Diamond();
        addObject(Diamond11,445, 340);

        Diamond Diamond12 = new Diamond();
        addObject(Diamond12,555, 340);
        
        //Set input
        Input input = new Input();
        addObject(input,409,640);

        FunctionInput functioninput = new FunctionInput();
        addObject(functioninput,950,315);
        
        //Set others
        Left left = new Left();
        addObject(left,888,639);

        Right right = new Right();
        addObject(right,950,640);

        Forwards forwards = new Forwards();
        addObject(forwards,830,640);
        
        PlayButton playbutton = new PlayButton();
        addObject(playbutton, 40, 640);
        
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
        addObject(hero2,500, 275);
    }
    
    //when hero does the wrong moves aka doesn't win, we reset everything
    //so this resets and re-adds all the diamonds to the original spots
    public void resetDiamonds()
    {
        removeObjects(getObjects(Diamond.class));
        counter.setValue(12);
        
        Diamond Diamond1 = new Diamond();
        addObject(Diamond1,445, 220);

        Diamond Diamond2 = new Diamond();
        addObject(Diamond2,555, 220);

        Diamond Diamond3 = new Diamond();
        addObject(Diamond3,335, 260);
        
        Diamond Diamond4 = new Diamond();
        addObject(Diamond4,445, 260);

        Diamond Diamond5 = new Diamond();
        addObject(Diamond5,555, 260);

        Diamond Diamond6 = new Diamond();
        addObject(Diamond6,665, 260);
        
        Diamond Diamond7 = new Diamond();
        addObject(Diamond7,335, 300);

        Diamond Diamond8 = new Diamond();
        addObject(Diamond8,445, 300);

        Diamond Diamond9 = new Diamond();
        addObject(Diamond9,555, 300);
        
        Diamond Diamond10 = new Diamond();
        addObject(Diamond10,665, 300);

        Diamond Diamond11 = new Diamond();
        addObject(Diamond11,445, 340);

        Diamond Diamond12 = new Diamond();
        addObject(Diamond12,555, 340);
    }
    
    //essentially checks if the hero has ended up on a block at the end of a
    //movement or step, if it is then it'll return true, it not, false
    public boolean checkOn(int xlocation, int ylocation)
    {
        //TRUE MEANS ON, FALSE MEANS OFF
        if ((xlocation == 500 && ylocation == 250-55) || (xlocation == 445 && ylocation == 270-55) || 
        (xlocation == 555 && ylocation == 270-55) || (xlocation == 390 && ylocation == 290-55) || 
        (xlocation == 610 && ylocation == 290-55) || (xlocation == 335 && ylocation == 310-55) ||
        (xlocation == 445 && ylocation == 310-55) || (xlocation == 555 && ylocation == 310-55) ||
        (xlocation == 665 && ylocation == 310-55) || (xlocation == 280 && ylocation == 330-55) ||
        (xlocation == 500 && ylocation == 330-55) || (xlocation == 720 && ylocation == 330-55) ||
        (xlocation == 335 && ylocation == 350-55) || (xlocation == 445 && ylocation == 350-55) ||
        (xlocation == 555 && ylocation == 350-55) || (xlocation == 665 && ylocation == 350-55) ||
        (xlocation == 390 && ylocation == 370-55) || (xlocation == 610 && ylocation == 370-55) ||
        (xlocation == 445 && ylocation == 390-55) ||
        (xlocation == 555 && ylocation == 390-55) || (xlocation == 500 && ylocation == 410-55) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
