 /**
 *  Jnesler 
 * Software engineering
 * Last Edit 12/1/2022
 */ 
package zombiewar;
 
public class Survivor extends Combatant{

 
protected static final String CHILD = "Child";
protected static final String TEACHER = "Teacher";
protected static final String SOLDIER = "Soldier";

 
private String survivorType;


public Survivor(String survivorType, int health, int attack) {
super(Combatant.SURVIVOR, health,  attack);

this.survivorType = survivorType;
}

 
@Override
public String toString() {
return survivorType;
}
}