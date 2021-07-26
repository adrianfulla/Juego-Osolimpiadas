import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaVictoria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaVictoria extends World
{

    /**
     * Constructor for objects of class PantallaVictoria.
     * 
     */
    public PantallaVictoria()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Victoria victoria = new Victoria();
        addObject(victoria,190,146);
        Salir salir = new Salir();
        addObject(salir,200,533);
        Volver volver = new Volver();
        addObject(volver,198,401);
    }
}
