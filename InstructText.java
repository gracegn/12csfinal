import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class InstructText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructText extends Actor
{
    //acts as static text for instructions page
    public void act() 
    {
        Color c = new Color(0,0,0,0);
        setImage(new GreenfootImage("Link needs your help to collect all the diamonds (money) and finally the textbook\nto go to university. Click the movement buttons in the lower right corner to tell\nLink how to move and where to go to get the diamonds and end at the textbook,\nthen click the play button in the lower left corner. Don't fall off the edges or\nhe'll die! Or worse, 'drop' out of university.\n \n The Function: \nThe main commands will show up in the botton rectangle, but there is a second\n'mini set' of commands called a function, which will appear in the vertical rectangle on\nthe right. Toggle the 'Edit F' button in the top right to go between editing the main\ncommands and the function. When editing the main commands, click the F button to\nadd the function.", 27, Color.WHITE, c));
    }    
}
