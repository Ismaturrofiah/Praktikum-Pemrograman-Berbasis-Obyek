import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Komet here.
 * 
 * @author (Ismaturrofiah) 
 * @version (09 Maret 2021)
 */
public class Komet extends Actor
{
    public Komet()
    {
        setRotation(90);
    }
    
    public void end()
    {
        if(getY() >= 390||getY() <= 0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void checkdouble(Actor K)
    {
        if(K!= null)
        {
            getWorld().removeObject(K);
        }
    }
    
    int speed = 3;
    public void act() 
    {
        Komet a = new Komet();
        Actor K = getOneIntersectingObject(Komet.class);
        move(speed);
        checkdouble(K);
        end();
    } 
    
    public void move(int speed)
    {
        setLocation(getX(), getY() + speed);
    }
}
