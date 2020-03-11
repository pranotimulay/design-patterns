package main.java.patterns.structural.adapter.two.way;

public class EnemyAttackerTank implements IEnemyAttackerMachine {

	@Override
	public void fireWeapon() {
		System.out.println("Firing weapon from the tank");
	}

	@Override
	public void driveForward() {
		System.out.println("Driving the tank forward");
	}

	@Override
	public void assignDriver(String driver) {
		System.out.println("Assigned driver: " + driver);

	}

}
