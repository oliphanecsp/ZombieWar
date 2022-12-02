 /**
 *  Jnesler 
 * Software engineering
 * Last Edit 12/1/2022
 */
package zombiewar;
 
public class CommonInfect extends Zombie {
    
    private static final int HEALTH = 30;
    private static final int ATTACK = 5;
    
    public CommonInfect() {
        super(Zombie.COMMON_INFECTED, HEALTH, ATTACK);
    }
}
