package main.java.patterns.structural.adapter.two.way;

/**
 * Target interface that interacts with the client, in this case it's an enemy
 * attacking machine with some predefined operations
 * 
 * @author Pranoti Mulay
 *
 */

public interface IEnemyAttackerMachine {

	public void fireWeapon();

	public void driveForward();

	public void assignDriver(String driver);

}
