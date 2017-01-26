import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aliens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aliens extends Actor
{
    private int speed = 2;
    
    /**
     * Act - do whatever the Aliens wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Space world = (Space)getWorld();
        int xLocation = getX();
        setLocation(getX()-speed, getY());
        
        
        if( isTouching(Cannon.class) ){
            removeTouching(Cannon.class);
            Greenfoot.playSound("au.wav");
            world.addScore(25);
            getWorld().removeObject(this);
        }
        
        if( xLocation == 0) 
        {
            getWorld().removeObject(this);
            Greenfoot.playSound("game-over.wav");
            world.showText("Well, we're doomed.", 750, 450);
            Greenfoot.stop();
        }
        
    }    
}
