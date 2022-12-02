 /**
 *  Jnesler 
 * Software engineering
 * Last Edit 12/1/2022
 */
package zombiewar;

public class Soldier extends Survivor{
       
    private static final int HEALTH = 100; 
    private static final int ATTACK = 10;
    
    public Soldier(){
        super(Survivor.SOLDIER, HEALTH, ATTACK);
    }
}
