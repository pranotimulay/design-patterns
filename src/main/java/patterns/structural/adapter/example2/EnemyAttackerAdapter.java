package main.java.patterns.structural.adapter.example2;

/**
 * Adapter that connects the attacking machine(target) with the attacking
 * robot(adaptee) so that robot can work as an attacking machine
 * 
 * @author Pranoti Mulay
 *
 */

public class EnemyAttackerAdapter implements EnemyAttackerMachine {

	private EnemyAttackerRobot robot;

	public EnemyAttackerAdapter(EnemyAttackerRobot robot) {
		this.robot = robot;
	}

	@Override
	public void fireWeapon() {
		robot.smashWithHands();
	}

	@Override
	public void driveForward() {
		robot.walkForward();
	}

	@Override
	public void assignDriver(String driver) {
		robot.react(driver);
	}

}
