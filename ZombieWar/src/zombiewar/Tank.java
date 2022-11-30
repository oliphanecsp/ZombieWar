/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zombiewar;

/**
 *
 * @author Mobile Gaming
 */
public class Tank extends Zombie{
    
    private static final int HEALTH =150;
    private static final int ATTACK =20;
    
    public Tank() 
    {
        super(Zombie.TANK, HEALTH, ATTACK);
        
    }
    
}
