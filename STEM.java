import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class STEM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class STEM extends Teacher
{
    /**
     * Act - do whatever the STEM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void assignedReading(int difficultyConstant) {
        int pp = 1000;
        super.ppReducer(pp);
        super.damageFromMove(10 + difficultyConstant);
    }
    @Override
    public String toString(){
        return super.toString() + "Stem, ";
    }
}
