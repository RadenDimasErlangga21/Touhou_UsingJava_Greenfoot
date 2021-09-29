import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class boss extends enemy
{
    GifImage myGif = new GifImage("enemy.gif");
    int timeHit=255;
    public void act() 
    {
        kenaHit();
        setImage( myGif.getCurrentImage());  
    }   
        public void kenaHit(){
        Actor projectile1 = getOneIntersectingObject(projectile.class);
        if (projectile1 != null){
        timeHit--;
        getWorld().removeObject(projectile1);
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        Counter counter = myWorld.getCounter();
        counter.addScore();
        }
        if (timeHit == 0){
            getWorld().removeObject(this);
        }
    }
}
