import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.*;

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    private final int MVTANIMATIONREPEATS = 20; //how many frames for each movement to the next block
    private final int TURNANIMATIONREPEATS = 20;
    private final int PAUSEANIMATIONREPEATS = 30;
    private  int initialfallspeed = 0;

    private int moveSpeedx1 = 2;
    private int moveSpeedx2 = 3;
    private int moveSpeedy = 1;
    private int aniSpeed = 5;
    private int frame = 1;

    private boolean playing = false;
    private String direction;
    private int animationCounter = 0;
    private int mvtarray = 0;           //counter to move thru mvt array, reset every time playing ends
    private int funcarray = 0;          //counter to move thru func array, reset every time it goes through array
    private boolean playingFunc = false;
    private boolean heroFalling = false;

    ArrayList<String> movement;
    ArrayList<String> func;

    private GreenfootImage Lbackcollect = new GreenfootImage("Lbackcollect.png");
    private GreenfootImage Rbackcollect = new GreenfootImage("Rbackcollect.png");
    private GreenfootImage Lforwardcollect = new GreenfootImage("Lforwardcollect.png");
    private GreenfootImage Rforwardcollect = new GreenfootImage("Rforwardcollect.png");

    private GreenfootImage Lforwardrest = new GreenfootImage("Lforwardrest.png");
    private GreenfootImage Rforwardrest = new GreenfootImage("Rforwardrest.png");

    private GreenfootImage Lrunback1 = new GreenfootImage("Lrunback1.png");
    private GreenfootImage Lrunback2 = new GreenfootImage("Lrunback2.png");
    private GreenfootImage Rrunback1 = new GreenfootImage("Rrunback1.png");
    private GreenfootImage Rrunback2 = new GreenfootImage("Rrunback2.png");

    private GreenfootImage Lrunforward1 = new GreenfootImage("Lrunforward1.png");
    private GreenfootImage Lrunforward2 = new GreenfootImage("Lrunforward2.png");
    private GreenfootImage Rrunforward1 = new GreenfootImage("Rrunforward1.png");
    private GreenfootImage Rrunforward2 = new GreenfootImage("Rrunforward2.png");

    // sets up the main aspects of the hero such as movement and animations
    public Hero(ArrayList<String> movement, ArrayList<String> func, String direction)
    {
        this.func = func;
        this.movement = movement;
        this.direction = direction;
        if(direction.equals("Lforwards"))
            setImage(Lforwardrest);
        else if(direction.equals("Rforwards"))
            setImage(Rforwardrest);
    }

    
    public void act() 
    {
        // WHEN PLAY BUTTON CLICKED, CHARACTER WILL PERFORM ACTIONS
        PlayButton playButton = (PlayButton) getWorld().getObjects(PlayButton.class).get(0);
        if(Greenfoot.mouseClicked(playButton))
        {
            playing = true;
        }

        //IF HERO FALLS OFF PLATFORM
        if(heroFalling == true)
        {
            if(getY() == 699)
            {
                if (getWorld() instanceof one)
                    Greenfoot.setWorld(new gameOver(1));
                if (getWorld() instanceof two)
                    Greenfoot.setWorld(new gameOver(2));
                if (getWorld() instanceof three)
                    Greenfoot.setWorld(new gameOver(3));
                if (getWorld() instanceof four)
                    Greenfoot.setWorld(new gameOver(4));
                if (getWorld() instanceof five)
                    Greenfoot.setWorld(new gameOver(5));
            }
            initialfallspeed++;
            setLocation(getX(), getY()+initialfallspeed);
            return;
        }
        
        //REMOVE DIAMONDS THAT YOU PICK UP
        Diamond diamond = (Diamond) getOneObjectAtOffset(0,0,Diamond.class);
        if (diamond != null)
        {
            diamond.caught();
        }

        //PLAY MAIN ARRAY
        if(playing == true && playingFunc == false && movement.size() > 0)
        {
            //IF LAST ITEM IS FINISHED THE HERO WILL PAUSE
            if(mvtarray == movement.size())
            {
                if(animationCounter < PAUSEANIMATIONREPEATS)
                {
                    play("pause");
                    animationCounter++;
                }
                else
                {
                    playing = false;
                    mvtarray = 0;

                    //if all the gems were collected & objective reached then stop, if not, reset
                    Objective objective = (Objective) getOneIntersectingObject(Objective.class);
                    if(!((levels)getWorld()).collectedOrNot() || objective == null)
                    {
                        ((levels)getWorld()).resetDiamonds();
                        ((levels)getWorld()).resetHero(movement, func);
                        ((levels)getWorld()).removeObject(this);
                    }
                    //else if they won and finished everything
                    else
                    {
                        int stepsUsed = movement.size() + func.size();
                        if (getWorld() instanceof one)
                            Greenfoot.setWorld(new congratsWin(1, 4, stepsUsed));
                        if (getWorld() instanceof two)
                            Greenfoot.setWorld(new congratsWin(2, 6, stepsUsed));
                        if (getWorld() instanceof three)
                            Greenfoot.setWorld(new congratsWin(3, 6, stepsUsed));
                        if (getWorld() instanceof four)
                            Greenfoot.setWorld(new congratsWin(4, 13, stepsUsed));
                        if (getWorld() instanceof five)
                            Greenfoot.setWorld(new congratsWin(5, 17, stepsUsed));
                    }
                }
            }

            // IF MOVEMENT
            else if(movement.get(mvtarray).equals("forwards"))
            {
                if(animationCounter < MVTANIMATIONREPEATS)
                {
                    // call play only once per 'act', using the same movement arraylist element until
                    // animationCounter gets to 20, then it'll go into else and change to the next
                    // element until theres none left, then it'll reset everything ie playing = false
                    play("forwards");
                    animationCounter++;
                }
                else
                {
                    animationCounter = 0;
                    if(((levels)getWorld()).checkOn(this.getX(), this.getY()) == false)
                    {
                        heroFalling = true;
                    }
                    mvtarray++;
                }
            }
            
            //IF TURNING
            else if(movement.get(mvtarray).equals("right") || movement.get(mvtarray).equals("left"))
            {
                if(animationCounter < TURNANIMATIONREPEATS)
                {
                    play(movement.get(mvtarray));
                    animationCounter++;
                }
                else
                {
                    animationCounter = 0;
                    mvtarray++;
                }
            }
            //IF FUNCTION
            else if(movement.get(mvtarray).equals("func"))
            {
                playingFunc = true;     //set playingFunc to true so the next act it will go into next if statement and go through func arrayfirst
                return;
            }
        }

        //PLAY FUNC ARRAY
        if(playingFunc == true)
        {
            //reached and FINISHED LAST ITEM, SO TIME TO WRAP UP AND EXIT FUNC
            if(funcarray == func.size())
            {
                playingFunc = false;
                funcarray = 0;
                mvtarray++;
            }

            //IF MOVEMENT
            else if(func.get(funcarray).equals("forwards"))
            {
                if(animationCounter < MVTANIMATIONREPEATS)
                {
                    play("forwards");
                    animationCounter++;
                }
                else
                {
                    animationCounter = 0;
                    if(((levels)getWorld()).checkOn(this.getX(), this.getY()) == false)
                    {
                        heroFalling = true;
                    }
                    funcarray++;
                }
            }
            
            //IF TURNING
            else if(func.get(funcarray).equals("right") || func.get(funcarray).equals("left"))
            {
                if(animationCounter < TURNANIMATIONREPEATS)
                {
                    play(func.get(funcarray));
                    animationCounter++;
                }
                else
                {
                    animationCounter = 0;
                    funcarray++;
                }
            }
        }
    }

    //set initial direction
    public void setDirection(String direct)
    {
        this.direction = direct;
    }

    // sets up array for order that the hero moves in 
    public void setArray(String button)
    {
        if(((levels)getWorld()).editF == false)
        {
            movement.add(button);
        }
        else
            func.add(button);
    }

    // when arrow removed, movement will be removed from array
    public void deleteFromArray()
    {
        if(((levels)getWorld()).editF == false)
        {
            if(movement.size() > 0)
                movement.remove(movement.size() - 1);
        }
        else
        {
            if(func.size() > 0)
                func.remove(func.size() - 1);
        }
    }

    public int getArraySize()
    {
        return movement.size();
    }

    // PRINTS ARRAY (TESTING PURPOSES)
    public void getArray()
    {
        System.out.println(movement);
    }

    public int fgetArraySize()
    {
        return func.size();
    }

    // PRINTS ARRAY (TESTING PURPOSES)
    public void fgetArray()
    {
        System.out.println(func);
    }
    
    // tells the hero how to move 
    public void play(String movement)
    {
        if(movement.equals("forwards") && direction.equals("Rforwards"))
            Rmoveforward();
        else if(movement.equals("forwards") && direction.equals("Lforwards"))
            Lmoveforward();
        else if(movement.equals("forwards") && direction.equals("Rbackwards"))
            Rrunback();
        else if(movement.equals("forwards") && direction.equals("Lbackwards"))
            Lrunback();

        //turn methods
        else if(movement.equals("left"))
            left();
        else if(movement.equals("right"))
            right();

        //pause for last item
        else if(movement.equals("pause"))
            gamePause();
    }

    // L MOVE FORWARD **************************************************************
    public void Lmoveforward()  //FIGURE OUT ACCORDING TO PLATFORM HOW MANY MOVES
    {
        //in order to keep with the platform positions, so it'll move
        //(x,y): (2,1)(3,1)(3,1)(3,1) repeat in order to move total (55,20)
        if(animationCounter % 4 == 0)
            setLocation(getX() - moveSpeedx1, getY() + moveSpeedy);
        else
            setLocation(getX() - moveSpeedx2, getY() + moveSpeedy);

        if(animationCounter % aniSpeed == 0)
        {
            if(frame == 1)
                setImage(Lrunforward1);
            else if(frame == 2)
            {
                setImage(Lrunforward2);
                frame = 0;
            }
            frame++;
        }

        if(animationCounter == MVTANIMATIONREPEATS - 1)
            setImage(Lforwardrest);
    }

    // R MOVE FORWARD **************************************************************
    public void Rmoveforward()  //FIGURE OUT ACCORDING TO PLATFORM HOW MANY MOVES
    {
        if(animationCounter % 4 == 0)
            setLocation(getX() + moveSpeedx1, getY() + moveSpeedy);
        else
            setLocation(getX() + moveSpeedx2, getY() + moveSpeedy);

        //System.out.println(animationCounter);
        if(animationCounter % aniSpeed == 0)
        {
            if(frame == 1)
                setImage(Rrunforward1);
            else if(frame == 2)
            {
                setImage(Rrunforward2);
                frame = 0;
            }
            frame++;
        }

        if(animationCounter == MVTANIMATIONREPEATS - 1)
            setImage(Rforwardrest);
    }

    // L RUN BACK **************************************************************
    public void Lrunback()  //FIGURE OUT ACCORDING TO PLATFORM HOW MANY MOVES
    {
        if(animationCounter % 4 == 0)
            setLocation(getX() - moveSpeedx1, getY() - moveSpeedy);
        else
            setLocation(getX() - moveSpeedx2, getY() - moveSpeedy);

        if(animationCounter % aniSpeed == 0)
        {
            if(frame == 1)
                setImage(Lrunback1);
            else if(frame == 2)
            {
                setImage(Lrunback2);
                frame = 0;
            }
            frame++;
        }

        if(animationCounter == MVTANIMATIONREPEATS - 1)
            setImage(Lrunback1);
    }

    // R RUN BACK **************************************************************
    public void Rrunback()  //FIGURE OUT ACCORDING TO PLATFORM HOW MANY MOVES
    {
        if(animationCounter % 4 == 0)
            setLocation(getX() + moveSpeedx1, getY() - moveSpeedy);
        else
            setLocation(getX() + moveSpeedx2, getY() - moveSpeedy);

        if(animationCounter % aniSpeed == 0)
        {
            if(frame == 1)
                setImage(Rrunback1);
            else if(frame == 2)
            {
                setImage(Rrunback2);
                frame = 0;
            }
            frame++;
        }

        if(animationCounter == MVTANIMATIONREPEATS - 1)
            setImage(Rrunback1);
    }

    //TURNING RIGHT **************************************************************
    public void right()
    {
        //System.out.println(animationCounter);
        if(direction.equals("Lforwards"))
        {
            setImage(Lrunback1);
            if(animationCounter == TURNANIMATIONREPEATS - 1)
                direction = "Lbackwards";
        }
        else if(direction.equals("Rforwards"))
        {
            setImage(Lforwardrest);
            if(animationCounter == TURNANIMATIONREPEATS - 1)
                direction = "Lforwards";
        }
        else if(direction.equals("Rbackwards"))
        {
            setImage(Rforwardrest);
            if(animationCounter == TURNANIMATIONREPEATS - 1)
                direction = "Rforwards";
        }
        else if(direction.equals("Lbackwards"))
        {
            setImage(Rrunback1);
            if(animationCounter == TURNANIMATIONREPEATS - 1)
                direction = "Rbackwards";
        }
    }

    //TURNING LEFT **************************************************************
    public void left()
    {
        //System.out.println("direction is " + direction);
        //System.out.println(animationCounter);
        if(direction.equals("Lforwards"))
        {
            setImage(Rforwardrest);
            if(animationCounter == TURNANIMATIONREPEATS - 1)
                direction = "Rforwards";
        }
        else if(direction.equals("Rforwards"))
        {
            setImage(Rrunback1);
            if(animationCounter == TURNANIMATIONREPEATS - 1)
                direction = "Rbackwards";
        }
        else if(direction.equals("Rbackwards"))
        {
            setImage(Lrunback1);
            if(animationCounter == TURNANIMATIONREPEATS - 1)
                direction = "Lbackwards";
        }
        else if(direction.equals("Lbackwards"))
        {
            setImage(Lforwardrest);
            if(animationCounter == TURNANIMATIONREPEATS - 1)
                direction = "Lforwards";
        }
    }

    //PAUSE FOR A SEC************************************************************
    public void gamePause()
    {

    }
}