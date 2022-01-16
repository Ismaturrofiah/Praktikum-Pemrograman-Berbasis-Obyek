import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Ismaturrofiah) 
 * @version (30 Maret 2021)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pesawat pesawat = new Pesawat(this);
        addObject(pesawat,122,174);
        bird bird = new bird();
        addObject(bird,460,69);
        bird.setLocation(567,369);
        Batu batu = new Batu();
        addObject(batu,335,42);
    }
}
