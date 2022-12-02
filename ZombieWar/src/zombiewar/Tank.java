 /**
 *  Jnesler 
 * Software engineering
 * Last Edit 12/1/2022
 */
package zombiewar;

public class Tank extends Zombie{
    
    private static final int HEALTH =150;
    private static final int ATTACK =20;
    
    public Tank() 
    {
        super(Zombie.TANK, HEALTH, ATTACK);
        
    }
    
}
