import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaInicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaInicio extends World
{

    
    
    public PantallaInicio()
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
        botoninicio botoninicio = new botoninicio();
        addObject(botoninicio,200,215);
        Salir salir = new Salir();
        addObject(salir,200,340);
        Instruccionboton instruccionboton = new Instruccionboton();
        addObject(instruccionboton,197,569);

    }
}
