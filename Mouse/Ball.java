import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (Ismaturrofiah) 
 * @version (20 April 2021)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        // Add your action code here.
        move(5);
        if(Greenfoot.getRandomNumber(100) > 10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    } 
    
    public void aksiTabrak(){
        Actor raketTabrak=getOneIntersectingObject(Raket.class);
        MyWorld myWorld=(MyWorld)getWorld();
        if(raketTabrak != null){
            myWorld.kurangNyawa();
            if(myWorld.getNyawa() <0){
                Greenfoot.stop();
                getWorld().showText("GAME OVER",getWorld().getWidth()/2,getWorld().getHeight()/2);
            }
        }
        getWorld().showText("nyawa : "+myWorld.getNyawa(),70,5);
    }
}
