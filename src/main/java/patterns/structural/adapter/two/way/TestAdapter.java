package main.java.patterns.structural.adapter.two.way;

/**
 * @author Pranoti Mulay Client that makes use of the two way adapter to convert
 *         from robot to machine and visa versa
 */

public class TestAdapter {

	public static void main(String[] args) {

		EnemyAttackerTank tank = new EnemyAttackerTank();

		EnemyAttackerRobot robot = new EnemyAttackerRobot();

		IEnemyAttackerMachine adapter1 = new EnemyAttackerAdaptorTwoWay(robot);
		IEnemyAttackerRobot adapter2 = new EnemyAttackerAdaptorTwoWay(tank);

		System.out.println("Adapter for robot to machine");
		adapter1.assignDriver("driver");
		adapter1.driveForward();
		adapter1.fireWeapon();

		System.out.println("Adapter for machine to robot");
		adapter2.react("driver");
		adapter2.walkForward();
		adapter2.smashWithHands();

	}

}
