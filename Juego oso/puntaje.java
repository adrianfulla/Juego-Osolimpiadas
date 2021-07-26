import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puntaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class puntaje extends Actor
{
    int puntos = 0;
    int cont = 50;
    /**
     * Act - do whatever the puntaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Puntaje: " + puntos,24, null, null));
        checkPuntos();
    }
    
    public void addPuntos()
    {
        puntos++;
    }
    public void checkPuntos()
    {
        if (puntos == 20)
        {
            if (cont > 0) { cont--;}
            else
            {
            Greenfoot.setWorld(new PantallaVictoria());
            }
        }
    }
    public void quitarPuntos()
    {
        if(puntos >0)
        {
            puntos--;
        }
    }
}
