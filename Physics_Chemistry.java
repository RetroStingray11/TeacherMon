import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Physics_Chemistry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Physics_Chemistry extends STEM
{
    /**
     * Act - do whatever the Physics_Chemistry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
     public void lab(){
        int pp = 10;
        super.ppReducer(pp);
        super.damageFromMove(30);
    }
    @Override
    public String toString(){
        return super.toString() + "Physics_Chemistry";
    }
}
