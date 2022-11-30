/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zombiewar;

/**
 *
 * @author Mobile Gaming
 */
public class CommonInfected extends Zombie {
    
    private static final int HEALTH = 30;
    private static final int ATTACK = 5;
    
    public CommonInfected() {
        super(Zombie.COMMON_INFECTED, HEALTH, ATTACK);
    }
}
