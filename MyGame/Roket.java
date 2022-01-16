import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Roket here.
 * 
 * @author (Ismaturrofiah) 
 * @version (09 Maret 2021)
 */
public class Roket extends Actor
{
    int score = 0;
    public void act() 
    {
        getWorld().showText("Score : "+score, 70, 30);
        moveAround();
        end();
    }  
    
    public void moveAround()
    {
     if(Greenfoot.isKeyDown("down"))
     {
         setLocation(getX(),getY()+5);
     }
     if(Greenfoot.isKeyDown("up"))
     {
         setLocation(getX(),getY()-5);
     }
     if(Greenfoot.isKeyDown("right"))
     {
         setLocation(getX()+5,getY());
     }if(Greenfoot.isKeyDown("left"))
     {
         setLocation(getX()-5,getY());
     }
    }
    
    public void end()
    {
        if(isTouching(Komet.class))
        {
            getWorld().showText("Game Over \n Score : " + score, 70, 30);
            Greenfoot.stop();
        }
    }
}
