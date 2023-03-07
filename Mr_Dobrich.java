import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mr_Dobrich here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mr_Dobrich extends Physics_Chemistry
{
    /**
     * Act - do whatever the Mr_Dobrich wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void psychoanalysis(){
        int pp = 2;
        super.ppReducer(pp);
        super.damageFromMove(35);
    }
    @Override
    public String toString(){
        return super.toString() + "Dobrich";
    }
}
