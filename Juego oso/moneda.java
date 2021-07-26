import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class moneda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moneda extends Actor
{
    GifImage gifImage = new GifImage("moneda.gif");
    int velocidad = 1;
    int contadorinicio = 100;
    boolean cambiogif = true;
    public void act()
    {
        if (contadorinicio > 0){
            contadorinicio = contadorinicio - 1;
        }
        else{
            if (cambiogif)
            {
            setImage(gifImage.getCurrentImage());
            }
            else{setImage(getImage());}
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
            velocidad = (Greenfoot.getRandomNumber(4))+1;
            World mundo = getWorld();
            MyWorld myworld = (MyWorld)mundo;
            puntaje puntos = myworld.getPuntaje();
            puntos.quitarPuntos();
        }
    }
}