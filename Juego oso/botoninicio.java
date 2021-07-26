import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class botoninicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class botoninicio extends pantallavic
{
    
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("Enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
