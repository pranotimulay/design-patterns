package main.java.patterns.structural.adapter.two.way;

/**
 * Enemy attacking robot that wishes to be adapted to enemy attacking
 * machine(Target)
 * 
 * @author Pranoti Mulay
 *
 */

public class EnemyAttackerRobot implements IEnemyAttackerRobot {

	public void smashWithHands() {
		System.out.println("Robot smashing with hands");
	}

	public void walkForward() {
		System.out.println("Robot walking forward");
	}

	public void react(String msg) {
		System.out.println("Reacting to " + msg);
	}

}
