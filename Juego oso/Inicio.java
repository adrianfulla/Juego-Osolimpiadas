import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends Actor
{
    GreenfootImage I1 = new GreenfootImage("inicio1.png");
    GreenfootImage I2 = new GreenfootImage("inicio2.png");
    GreenfootImage I3 = new GreenfootImage("inicio3.png");
    GreenfootImage I4 = new GreenfootImage("inicio4.png");
    int contadorinicio = 100;
    /**
     * Act - do whatever the Inicio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (contadorinicio>0)
        {
            contadorinicio=contadorinicio-1;
            if(contadorinicio == 100) setImage(I1);
            if(contadorinicio == 75) setImage(I2);
            if(contadorinicio == 50) setImage(I3);
            if(contadorinicio == 25) setImage(I4);
        }
        else
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);
        }
    }
}
