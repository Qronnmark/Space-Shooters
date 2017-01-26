/**
 * Name: Quenton Ronnmark
 * Teacher: Mr. Hardman
 * Class: Computer Science
 * Final Project
 * January 20th, 2017
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    private double Gameover;
    
    private int score;
    
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {   
        super(1500, 900, 1); 
        Rocket Rocket = new Rocket();
        addObject(Rocket, 100, 179);
        Aliens Aliens = new Aliens();
        score = 0;
        showScore();
    }
    
    /**
     *  Act is used to spawn in enemies at a random intervals at random spots.
     *  
     *  @param There are no parameters
     *  @return Nothing is returned.
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 4)
        {
            addObject(new Aliens(), 1500, Greenfoot.getRandomNumber(900));
        }
        
    }
    
    /**
     *  showScore is used to show your score.
     *  
     *  @param There are no parameters.
     *  @return Nothing is returned.
     */
    public void showScore() 
    {
          showText( "Score: " + score, 80, 25);
        
    }
    
    /**
     *  AddScore is used to add up your score and give you the win when you get to 5000.
     *  
     *  @param the parameters are to retain the point counter.
     *  @return Nothing is returned.
     */
    public void addScore(int points)
    {
        score += points;
        showScore();
       
        if( score >= 5000) 
        {
          Greenfoot.playSound("fanfare.wav");
          showText("Congrats Champ! 10/10 - Ign.", 750, 450);
          Greenfoot.stop();
        
        }
        
    }
}
    