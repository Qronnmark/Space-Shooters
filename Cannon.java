import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int numCannon = getWorld().getObjects(Cannon.class).size();
        
        setLocation(getX()+5, getY());

        if( this.getX() == 1499 ){
            getWorld().removeObject(this);
            
        }   
       
    }
}
 