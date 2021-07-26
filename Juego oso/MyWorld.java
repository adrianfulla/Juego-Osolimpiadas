import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    puntaje puntos = new puntaje();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        setPaintOrder(Inicio.class, puntaje.class, copo.class, oso.class,moneda.class,arbol.class,piedra.class);
        prepare();
    }
    
    public puntaje getPuntaje()
    {
        return puntos;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(puntos, 67,40);
        moneda moneda = new moneda();
        addObject(moneda,62,230);
        copo copo = new copo();
        addObject(copo,73,97);
        copo copo2 = new copo();
        addObject(copo2,120,177);
        copo copo3 = new copo();
        addObject(copo3,195,102);
        copo copo4 = new copo();
        addObject(copo4,237,224);
        copo copo5 = new copo();
        addObject(copo5,335,94);
        copo copo6 = new copo();
        addObject(copo6,341,325);
        copo copo7 = new copo();
        addObject(copo7,164,319);
        copo copo8 = new copo();
        addObject(copo8,80,430);

        copo copo9 = new copo();
        addObject(copo9,242,417);

        copo copo10 = new copo();
        addObject(copo10,341,476);
        copo copo11 = new copo();
        addObject(copo11,79,525);

        oso oso = new oso();
        addObject(oso,199,525);
        copo8.setLocation(82,449);
        piedra piedra = new piedra();
        addObject(piedra,82,449);
        piedra piedra2 = new piedra();
        addObject(piedra2,322,198);
        arbol arbol = new arbol();
        addObject(arbol,208,304);
        arbol arbol2 = new arbol();
        addObject(arbol2,174,0);
        arbol2.setLocation(172,28);
        arbol.setLocation(171,226);
        arbol2.setLocation(177,72);
        arbol2.setLocation(187,29);
        arbol2.setLocation(180,20);
        arbol.setLocation(197,307);
        Inicio inicio = new Inicio();
        addObject(inicio,197,307);
        objetivo objetivo = new objetivo();
        addObject(objetivo,300,40);
    }
}
