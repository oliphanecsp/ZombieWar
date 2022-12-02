 /**
 *  Jnesler 
 * Software engineering
 * Last Edit 12/1/2022
 */ 
package zombiewar;

public class Child extends Survivor{
     
    
    
    private static final int HEALTH = 20;
    private static final int ATTACK = 2;
    
    public Child(){
        // superclass to pass this types Health and attack 
        super(Survivor.CHILD, HEALTH, ATTACK);
    }
}
