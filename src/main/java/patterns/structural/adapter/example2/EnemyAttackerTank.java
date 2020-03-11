package main.java.patterns.structural.adapter.example2;

public class EnemyAttackerTank implements EnemyAttackerMachine {

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
