/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zombiewar;

public class Combatant
{
 
// Character types
protected static final String ZOMBIE= "Zombie";
protected static final String SURVIVOR = "Survivor";

// Instance variables
private String combatantType;
private int health;
private int attack;

 
public Combatant(String combatantType, int health, int attack) {
this.combatantType = combatantType;
this.health = health;
this.attack = attack;
}
 
public void attack(Combatant combatant) {
 
combatant.health = combatant.health - this.attack;
}

 
public boolean isDead() {
return (health <= 0);
}
}

