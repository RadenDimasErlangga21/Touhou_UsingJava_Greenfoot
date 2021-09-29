import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * code boss
 * 
 * @author (raden dimas erlangga) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    public void act() 
    {

    }    
    public void pergerakan(){
        setLocation(getX(), getY()+3);
    }
    public void removeEnemy(){
        if (getY()==599){
        getWorld().removeObject(this);
    }
        else if(isTouching(player.class)){
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        Healthbar healthbar = myWorld.getHealthbar();
        getWorld().removeObject(this);
        healthbar.loseHealth();
        }
    }
}
