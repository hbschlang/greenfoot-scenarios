import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro3 extends Intros
{
    public int life = 50;
    /**
     * Act - do whatever the Intro2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        life--;
        if(life < 0)
        {
            getWorld().removeObject(this);
        }
    }      
}
