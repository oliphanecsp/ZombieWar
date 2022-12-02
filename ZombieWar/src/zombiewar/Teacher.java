 /**
 *  Jnesler 
 * Software engineering
 * Last Edit 12/1/2022
 */
package zombiewar;

public class Teacher extends Survivor{
    
    private static final int HEALTH = 50; 
    private static final int ATTACK = 5;
    
    public Teacher(){
        super(Survivor.TEACHER, HEALTH, ATTACK);
    }
}
