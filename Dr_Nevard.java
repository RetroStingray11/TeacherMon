import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dr_Nevard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dr_Nevard extends Math_CS
{
    /**
     * Act - do whatever the Dr_Nevard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
     public void childProdigy(){
        int pp = 2;
        super.ppReducer(pp);
        super.damageFromMove(80);
    }
    @Override
    public String toString(){
        return super.toString() + "Nevard";
    }
}
