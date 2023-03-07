import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Math_CS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Math_CS extends STEM
{
    /**
     * Act - do whatever the Math_CS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void Proof(int health) {
        int pp = 5;
        super.ppReducer(pp);
        super.addHealth(health,20);
    }
    @Override
    public String toString(){
        return super.toString() + "Math_CS";
    }
}
