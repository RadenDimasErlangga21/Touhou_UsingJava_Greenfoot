import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Counter extends Actor
{
    int score = 0;
    public Counter(){
       setImage(new GreenfootImage("score : "+ score, 30, Color.WHITE, Color.BLACK));
    }
    public void act() 
    {
       setImage(new GreenfootImage("score : "+ score, 30, Color.WHITE, Color.BLACK));
       youWin();
    }    
    public void addScore(){
        score++;
    }
    public void youWin(){
        if (score == 255){
            getWorld().addObject(new Youwin(), 300,300);
            Greenfoot.stop();
        }
    }
}
