import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (raden dimas erlangga) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    boolean bisatembak = true;
    GifImage myGif = new GifImage("player.gif");
    public void act() 
    {
      setImage( myGif.getCurrentImage());  
      gerakGerak();
      tembak();
    }    
    public void gerakGerak()
    {
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+3, getY());
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-3, getY());
        }
    }
    public void tembak(){
        if (Greenfoot.isKeyDown("z") && bisatembak == true){
            getWorld().addObject(new projectile(),getX(),getY()-38);
            bisatembak = false;
        }
        else if (!Greenfoot.isKeyDown("z")){
            bisatembak = true;
        }
}
}
