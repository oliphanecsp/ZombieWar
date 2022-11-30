/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zombiewar;

/**
 *
 * @author Mobile Gaming
 */
public class Zombie extends Combatant {

// Zombie types
protected static final String COMMON_INFECTED = "CommonInfected";
protected static final String TANK = "Tank";

// Instance variables
private String zombieType;
 
public Zombie(String zombieType, int health, int attack) {
super(Combatant.ZOMBIE, health, attack);

// Set zombie type
this.zombieType = zombieType;
}
 
@Override
public String toString() {
return zombieType;
}
}
