/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zombiewar;

/**
 *
 * @author Mobile Gaming
 */
public class Child extends Survivor{
    
    private static final int HEALTH = 20;
    private static final int ATTACK = 2;
    
    public Child(){
        super(Survivor.CHILD, HEALTH, ATTACK);
    }
}
