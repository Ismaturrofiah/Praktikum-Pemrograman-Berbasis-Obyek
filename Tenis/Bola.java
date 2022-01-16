import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bola here.
 * 
 * @author (Ismaturrofiah) 
 * @version (20 April 2021)
 */
public class Bola extends Actor
{
    /**
     * Act - do whatever the Bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        if(Greenfoot.getRandomNumber(100) > 10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    
    public void aksiTabrak(){
        Actor raketTabrak=getOneIntersectingObject(Raket.class);
        MyWorld MyWorld=(MyWorld)getWorld();
        if(raketTabrak != null){
            MyWorld.kurangNyawa();
            if(MyWorld.getNyawa() <0){
                Greenfoot.stop();
                getWorld().showText("GAME OVER",getWorld().getWidth()/2,getWorld().getHeight()/2);
            }
        }
        getWorld().showText("nyawa : "+MyWorld.getNyawa(),70,5);
    }
}
