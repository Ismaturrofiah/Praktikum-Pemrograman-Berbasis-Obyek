import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Raket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Raket extends Actor
{
    /**
     * Act - do whatever the Raket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        gerakRaket();
        smashRaket();
        Remove();
    } 
    
    public void gerakRaket(){
        if(Greenfoot.getMouseInfo() !=null)
        {
            int lokX=Greenfoot.getMouseInfo().getX();
            int lokY=Greenfoot.getMouseInfo().getY();
            setLocation(lokX,lokY);
        }
    }
    
    public void smashRaket(){
        if(Greenfoot.mousePressed(this))
        {
            move(100);
            turn(90);
            Greenfoot.delay(5);
            turn(-90);
        }
    }
    
    public void Remove() {
        if(Greenfoot.mousePressed(this))
        {
            removeTouching(Ball.class);
        }
    }
}
