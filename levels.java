import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.*;
/**
 * Write a description of class levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levels extends World
{
    //counter = counts diamonds left, collected = whether or not they're all collected
    //editF = boolean telling you if the player is editing the function input right now (true) or main (false)
    public static Counter counter = new Counter("Diamonds Left: ");
    public static boolean collected = false;
    public static boolean editF = false;
    public int mainXinitial = 167;  // initial add for main input
    public int mainYinitial = 640;
    public int funcXinitial = 950;
    public int funcYinitial = 190;

    public levels()
    {    
        super(1000, 700, 1);
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
    
    //changes editF, so if it was true and player was changing the function input, it'll change to main
    public void setEditF()
    {
        editF = !editF;
    }
    
    //when hero does the wrong moves aka doesn't win, we reset everything
    //so this resets and re-adds all the diamonds to the original spots
    public void resetDiamonds()
    {

    }

    //once player clicks forward or whatever button, we want to add its picture to the input bar in the
    //next available spot but can't allow them to be clicked and act as new buttons
    public void addButton(String command, int xchange)
    {
        if(editF == false)
        {
            //System.out.println("LEVELS addButton called " + command);
            if(command.equals("forwards"))
            {
                ForwardsP forwardsP2 = new ForwardsP();
                addObject(forwardsP2, mainXinitial + xchange, mainYinitial);
            }
            if(command.equals("left"))
            {
                LeftP leftP2 = new LeftP();
                addObject(leftP2,mainXinitial + xchange, mainYinitial);
            }
            if(command.equals("right"))
            {
                RightP rightP2 = new RightP();
                addObject(rightP2,mainXinitial + xchange, mainYinitial);
            }
            if(command.equals("func"))
            {
                FunctionButtonP functionButtonP2 = new FunctionButtonP();
                addObject(functionButtonP2,mainXinitial + xchange, mainYinitial);
            }
        }
        else
        {
            //System.out.println("LEVELS addButton called " + command);
            if(command.equals("forwards"))
            {
                ForwardsP forwardsP2 = new ForwardsP();
                addObject(forwardsP2, funcXinitial, funcYinitial + xchange);    // CHANGE FOR FUNC
            }
            if(command.equals("left"))
            {
                LeftP leftP2 = new LeftP();
                addObject(leftP2, funcXinitial, funcYinitial + xchange);
            }
            if(command.equals("right"))
            {
                RightP rightP2 = new RightP();
                addObject(rightP2, funcXinitial, funcYinitial + xchange);
            }
            //cannot add function button inside function itself
        }
    }

    //if delete button is clicked, we follow arraysize and editF to find the last object, then remove it
    //from both the array and the actual image from the screen
    public void deleteButton(int ArraySize)
    {
        if(editF == false)
        {
            for (Object obj : getObjectsAt(mainXinitial + (ArraySize-2)*60, mainYinitial, null))
            {
                //Diamond diamond = new Diamond();
                //addObject(diamond, 190 + (heroArraySize-2)*60, 640);
                Actor actor = (Actor) obj;
                if (actor instanceof LeftP || actor instanceof RightP || actor instanceof ForwardsP || actor instanceof FunctionButtonP)
                    removeObject(actor);
            }
        }
        else
        {
            for (Object obj : getObjectsAt(funcXinitial, funcYinitial + (ArraySize-2)*60, null)) //CHANGE FOR FUNC
            {
                //Diamond diamond = new Diamond();
                //addObject(diamond, 190 + (heroArraySize-2)*60, 640);
                Actor actor = (Actor) obj;
                if (actor instanceof LeftP || actor instanceof RightP || actor instanceof ForwardsP || actor instanceof FunctionButtonP)
                    removeObject(actor);
            }
        }
    }

    //when hero does the wrong moves aka doesn't win, we reset everything
    //so this resets and re-adds the hero to the original spot
    public void resetHero(ArrayList<String> movement, ArrayList<String> func)
    {
        
    }
    
    //not complete, they're overridden in subclass levels but it essentially checks if the hero has ended up on a block at the end of a
    //movement or step, if it is then it'll return true, it not, false
    public boolean checkOn(int xlocation, int ylocation)
    {
        return true;
    }
}
