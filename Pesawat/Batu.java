import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Batu here.
 * 
 * @author (Ismaturrofiah) 
 * @version (29 Maret 2021)
 */
public class Batu extends Actor
{
    /**
     * Act - do whatever the Batu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        if(Greenfoot.getRandomNumber(100)>10){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }    
}
