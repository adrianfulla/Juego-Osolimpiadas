import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oso extends Actor
{
    GreenfootImage estatico = new GreenfootImage("osoestatico.png");
    GreenfootImage adelante = new GreenfootImage("osoadelante.png");
    GreenfootImage rapido = new GreenfootImage("osorapido.png");
    GreenfootImage ladoder = new GreenfootImage("osod-2.png");
    GreenfootImage ladoizq = new GreenfootImage("osoi-2.png");
    
    
    int contadorinicio = 100;
    int contadoranim = 0;
    int velocidad = 1;
    
       
    public void act()
    {
        if (contadorinicio > 0){
            contadorinicio = contadorinicio - 1;
        }else{
        checkTecla();
        anim();
        piedracolision();
        arbolcolision();
        recolectorMoneda();
        comandos();
    }
    }
    public void checkTecla()
    {
        if (Greenfoot.isKeyDown ("Left")){
            move(-velocidad);
        }
        if (Greenfoot.isKeyDown ("Right")){
            move(velocidad);
        }
        if (Greenfoot.isKeyDown ("Up"))
        {
            setLocation(getX(),getY()-velocidad);
        }
        if (Greenfoot.isKeyDown ("Down"))
        {
            setLocation(getX(),getY()+velocidad);
        }
        }
    public void anim()
    {
        if (Greenfoot.isKeyDown ("Left")){
            setImage(ladoizq);
        }
        else if (Greenfoot.isKeyDown ("Right")){
            setImage(ladoder);
        }
        else if (Greenfoot.isKeyDown ("Up"))
        {
            setImage(rapido);
        }
        else if (Greenfoot.isKeyDown ("Down"))
        {

        }
        else {
            setImage(adelante);
        }
        }
    public void piedracolision()
    {
        Actor a = getOneIntersectingObject(piedra.class);
        if (a != null)
        {
            setImage(estatico);
            Greenfoot.delay(1);
            
        }
    }
    public void arbolcolision()
    {
        Actor a = getOneIntersectingObject(arbolobstaculo.class);
        if (a != null)
        {
            setImage(estatico);
            Greenfoot.delay(1);   
        }
    }
    public void recolectorMoneda()
    {
        Actor moneda = getOneIntersectingObject(moneda.class);
        if(moneda !=null)
        {
            World mundo = getWorld();
            mundo.removeObject(moneda);
            mundo.addObject(moneda, Greenfoot.getRandomNumber(400), 10);
            MyWorld myworld = (MyWorld)mundo;
            puntaje puntos = myworld.getPuntaje();
            puntos.addPuntos();
        }
    }
    public void comandos()
    {
        if(Greenfoot.isKeyDown("escape"))
        {
            Greenfoot.setWorld(new PantallaInicio());
        }
        if("r".equals(Greenfoot.getKey()))
        {
            Greenfoot.setWorld(new MyWorld());            
        }
    }
}
    
    


