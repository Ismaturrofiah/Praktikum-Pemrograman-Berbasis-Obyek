import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here. 
 * 
 * @author (Ismaturrofiah) 
 * @version (09 Maret 2021)
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void act()
    {
        Komet();
    }
    
    public void Komet()
    {
        if(Greenfoot.getRandomNumber(100)<1)
        {
        addObject(new Komet(), Greenfoot.getRandomNumber(400), 0);
        }
    }
    
    private void prepare()
    {
        Roket roket = new Roket();
        addObject(roket,52,191);
        Love love = new Love();
        addObject(love,38,40);
        Love love2 = new Love();
        addObject(love2,96,40);
        Love love3 = new Love();
        addObject(love3,155,40);
        Komet komet = new Komet();
        addObject(komet,258,125);
        Komet komet2 = new Komet();
        addObject(komet2,355,51);
        Komet komet3 = new Komet();
        addObject(komet3,261,17);
        komet3.setLocation(259,5);
    }
    
}
