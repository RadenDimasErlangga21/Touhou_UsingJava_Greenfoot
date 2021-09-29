import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Healthbar healthbar = new Healthbar();
    Counter counter = new Counter();
    public MyWorld()
    {    
        super(600, 600, 1); 
        prepare();
        bossLocation();
        addEnemy1();
    }
    public Counter getCounter(){
        return counter;
    }
    public Healthbar getHealthbar(){
        return healthbar;
    }
    public void act(){
        if (Greenfoot.getRandomNumber(30)<1){
        addEnemy1();
    }
    }
        public void addEnemy1(){
        addObject(new enemy_p1(), Greenfoot.getRandomNumber (600), 0);
    }
        
    private void prepare(){
        player touhou = new player();
        addObject(touhou, 250, 510);
        touhou.setLocation(297,510);
        addObject(counter, 60, 20);
        addObject(healthbar, 55, 50);
    }

        private void bossLocation(){
        boss boss = new boss();
        addObject(boss, 250, 510);
        boss.setLocation(297,80);
    }
}
