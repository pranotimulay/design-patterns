package main.java.patterns.creational.abstractfactory;

import java.util.Scanner;

public class AbstractFactoryPatternTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Which type of animal? (MAMMAL/INSECT)");
		String factoryType = scanner.nextLine();

		AbstractFactory factory = FactoryProducer.getFactory(factoryType);
		System.out.println("Which type of " + factoryType + "?");

		String animalType = scanner.nextLine();
		Animal animal = factory.getAnimal(animalType);

		animal.show();
		scanner.close();
	}
}
