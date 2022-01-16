import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pesawat here.
 * 
 * @author (Ismaturrofiah) 
 * @version (16 Maret 2021)
 */
public class Pesawat extends Actor
{
    int maju=0;
    int putaran=0;
    boolean flag=true;
    
    String namaPesawat;
    
    public Pesawat(MyWorld myWorld){
        String nama=Greenfoot.ask("Sebutkan nama pesawat");
        namaPesawat=nama;
        myWorld.showText("nama : "+namaPesawat,125,10);
    }
        
    public void act() 
    {
        /*
        if(getRotation()<=30){
          majuDanBerputar(10,5);
        }  
        if(getRotation()>30){
          majuDanBerputar(0,-5);
        } */
        gerakPesawat();
    }
    
    private void gerakPesawat()
    { 
        if(Greenfoot.isKeyDown("RIGHT")){
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("LEFT")){
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("UP")){
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("DOWN")){
            setLocation(getX(), getY()+5);
        }
    }
    /*
    public void majuDanBerputar(int rentangMaju, int rentangBerputar)
    {
        maju=rentangMaju;
        putaran=rentangBerputar;
        move(rentangMaju);
        turn(rentangBerputar);
    }*/    
}
