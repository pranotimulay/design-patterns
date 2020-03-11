package main.java.patterns.structural.adapter.example2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestAdapter {

	public static void main(String[] args) throws IOException {

		// EnemyAttackerTank tank = new EnemyAttackerTank();
		//
		// EnemyAttackerRobot robot = new EnemyAttackerRobot();
		//
		// EnemyAttackerAdapter adapter = new EnemyAttackerAdapter(robot);
		//
		// List<EnemyAttackerMachine> attackers = new ArrayList<>();
		// attackers.add(tank);
		// attackers.add(adapter);
		//
		// for (EnemyAttackerMachine machine : attackers) {
		// machine.fireWeapon();
		// machine.driveForward();
		// machine.assignDriver("test");
		// }
		//

		OutputStream oStream = new BufferedOutputStream(
				new FileOutputStream("D:/SEMESTER_2/SCM/spotbugs-master/spotbugs/test folder space 123/test.txt"));
		oStream.write(3232);

	}

}
