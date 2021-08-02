import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arborevento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arborevento extends World
{

    /**
     * Constructor for objects of class arborevento.
     * 
     */
    public arborevento()
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
        basesubida basesubida = new basesubida();
        addObject(basesubida,204,501);
        basesubida basesubida2 = new basesubida();
        addObject(basesubida2,346,504);
        basesubida basesubida3 = new basesubida();
        addObject(basesubida3,50,503);
        osoenemigo1 osoenemigo1 = new osoenemigo1();
        addObject(osoenemigo1,310,441);
        osoenemigo2 osoenemigo2 = new osoenemigo2();
        addObject(osoenemigo2,85,440);
        osopjarbol osopjarbol = new osopjarbol();
        addObject(osopjarbol,167,440);
    }
}
