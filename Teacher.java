import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Teacher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Teacher extends Actor
{
    /**
     * Act - do whatever the Teacher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int damage;
    public int pp;
    public int health;
    public void act()
    {
        // Add your action code here.
    }
    public Teacher(int health){
        this.health = health;
    }
    public int assignHomework(int difficultyConstant) {
        return difficultyConstant*10;
    }
    public int damageFromMove(int damage){
        this.damage = damage;
        return damage;
    }
    public int health(int health){
        if(health > damage){
            return health - damage;
        }
        else{
            return 0;
        }
    }
    public void addHealth(int health, int healthToAdd){
        health = this.health;
        health += healthToAdd;
    }
    public String toString(){
        return "Teacher: ";
    }
    public void ppReducer(int pp){
        if(pp == 0){
            System.out.println("You can no longer use this move");
        }
        else{
            this.pp = pp;
            pp--;
        }
    }
}
