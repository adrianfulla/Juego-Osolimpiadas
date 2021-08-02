import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class osopjarbol extends Actor
{
    private boolean barraPresionada;
    private int velocidad = 20;
    public void act()
    {
        subir();
        if (verBase() == false)
        {
            caida();
        }
        victoria();
        comandos();
    }
    public void subir()
    {
        if (barraPresionada != Greenfoot.isKeyDown("space")) {
        barraPresionada = ! barraPresionada;
            if (barraPresionada)
            {
                setLocation(getX(),getY() - velocidad);
            }
        }
    }
    public void caida()
    {
        setLocation(getX(), getY() + 1);
    }
    public boolean verBase()
    {
        boolean sobrebase = false;
        if(getOneObjectAtOffset(getImage().getWidth()/2, getImage().getHeight()/4,basesubida.class) != null)
        {
            sobrebase = true;
        }
        return sobrebase;
    }
    public void victoria()
    {
        if(getY()<2)
        {
            Greenfoot.setWorld(new PantallaVictoria());
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

