import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class English here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class English extends Humanities
{
    /**
     * Act - do whatever the English wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
     public void IBEssay(int difficultyConstant) {
        int pp = 1;
        super.ppReducer(pp);
        super.damageFromMove(60);
    }
    @Override
    public String toString(){
        return super.toString() + "English";
    }
}
