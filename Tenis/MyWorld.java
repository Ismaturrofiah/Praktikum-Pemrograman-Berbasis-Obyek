import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Ismaturrofiah) 
 * @version (20 April 2021)
 */
public class MyWorld extends World
{
    static int nyawa;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //prepare();
        Raket raket = new Raket();
        addObject(raket,100,100);
        nyawa=getNyawa();
        for(int i=0;i<3;i++){
            addObject(new Bola(), Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        }
        showText("nyawa : "+getNyawa(),70,5);
        prepare();
    }

    void kurangNyawa(){
        nyawa=nyawa-10;
    }

    void tambahNyawa(){
        nyawa=nyawa+10;
    }

    public int getNyawa(){
        return nyawa;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    /*private void prepare()
    {
    Bola bola = new Bola();
    addObject(bola,318,157);
    Raket raket = new Raket();
    addObject(raket,175,155);
    }*/
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
