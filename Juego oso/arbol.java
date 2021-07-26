import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arbol extends Actor
{
    int contadorinicio = 100;
    int velocidad = 2;
    public void act()
    {
        if (contadorinicio > 0){
            contadorinicio = contadorinicio - 1;
        }else{
            bajar();
            posicionar();
        }
    }
    public void bajar()
    {
    setLocation(getX(), getY()+velocidad);
    } 
    public void posicionar()
    {
        if(getY()>590)
        {
            setLocation(Greenfoot.getRandomNumber(400),10);
            
        }
    }
}
