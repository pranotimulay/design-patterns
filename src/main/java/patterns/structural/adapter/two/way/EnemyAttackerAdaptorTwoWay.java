package main.java.patterns.structural.adapter.two.way;

public class EnemyAttackerAdaptorTwoWay implements IEnemyAttackerMachine, IEnemyAttackerRobot {

	private EnemyAttackerRobot robot;
	private EnemyAttackerTank tank;

	public EnemyAttackerAdaptorTwoWay(EnemyAttackerRobot robot) {
		this.robot = robot;
	}

	public EnemyAttackerAdaptorTwoWay(EnemyAttackerTank tank) {
		this.tank = tank;
	}

	@Override
	public void smashWithHands() {
		tank.fireWeapon();
	}

	@Override
	public void walkForward() {
		tank.driveForward();
	}

	@Override
	public void react(String msg) {
		tank.assignDriver(msg);
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
