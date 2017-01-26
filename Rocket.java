import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    private int speed = 4;
    
    private int reloadCount = 25;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
        
        reloadCount++;
        
        checkCollision();
        
        
        
    }    
    
    /**
     * checkKeyPress makes the Rocket move up and down and fire a cannon when buttons are pressed.
     * 
     * @param There are no Parameters
     * @return Nothing is returned.
     */
    private void checkKeyPress() 
    { 
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-speed);
        }
        
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+speed);
        }
        
        if (Greenfoot.isKeyDown("space"))
        {
            if( reloadCount >= 25)  
            {
                getWorld().addObject(new Cannon(), getX()+30, getY());
                reloadCount = 0;
            }
        }
        
        if (Greenfoot.isKeyDown("shift"))
        {
            speed = 10;
        } else {
            speed = 4;
        }
    }
    
    /**
     * checkCollision allows the game to end if you get touched by a alien.
     * 
     * @param There are no parameters
     * @return There is nothing that gets returned
     */
    private void checkCollision()
    {
        Space world = (Space)getWorld();
        
        
        if( isTouching(Aliens.class) ) 
        {
            Greenfoot.playSound("game-over.wav");
            world.showText("Fail!", 750, 450);
            Greenfoot.stop();
        }
    } 
}

        