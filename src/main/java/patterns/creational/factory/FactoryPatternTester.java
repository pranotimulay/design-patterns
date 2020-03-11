package main.java.patterns.creational.factory;

import java.util.Scanner;

public class FactoryPatternTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter car type (BMW/MERC/HONDA)");

		String carType = scanner.nextLine();

		Car car = CarFactory.getCar(carType);
		if (car == null) {
			System.out.println("Invalid car type..");
			scanner.close();
			return;
		}
		car.honk();
		scanner.close();
	}

}
