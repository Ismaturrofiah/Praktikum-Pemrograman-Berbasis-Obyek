import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird here.
 * 
 * @author (Ismaturrofiah) 
 * @version (15 Maret 2021)
 */
public class bird extends Actor
{
    int angka = -10;
    public void act() 
    {
       if(getX()<10){
           angka=10;
       }else if(getX()>550){
           angka=-10;
       }
       move(angka);
    }    
}
