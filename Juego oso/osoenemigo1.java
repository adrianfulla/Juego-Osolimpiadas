import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class osoenemigo1 extends Actor
{
    private int velocidad =2;
    private int vcaida = 1;
    private int aceleracion = 1;
    private int acaida = 1;
    private int cont = 0;
    public void act()
    {
        subir();
        if (verBase() == false)
        {
            caida();
        }
        acelerarCaida();
        cont++;
    }
    public void subir()
    {
        setLocation(getX(),getY() - velocidad);
        }
    public void caida()
    {
        setLocation(getX(), getY() + acaida);
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
    public void acelerarCaida()
    {
        if(cont == 200)
        {
            acaida = 2;
        }
        if (cont == 500)
        {
            acaida = 3;
        }
        if (cont == 700)
        {
            acaida = 0;
            velocidad = 0;
        }
    }
}
