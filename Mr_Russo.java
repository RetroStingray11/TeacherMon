import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mr_Russo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mr_Russo extends Physics_Chemistry
{
    /**
     * Act - do whatever the Mr_Russo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void expelledFromHackensackUniversity(){
        int pp = 1;
        super.ppReducer(pp);
        super.damageFromMove(100);
    }
    @Override
    public String toString(){
        return super.toString() + "Russo";
    }

}
