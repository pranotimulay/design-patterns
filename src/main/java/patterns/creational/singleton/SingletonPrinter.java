package main.java.patterns.creational.singleton;

public class SingletonPrinter {
	protected static SingletonPrinter instance;

	private SingletonPrinter() {

	}

	public static SingletonPrinter getInstance() {
		if (instance == null) {
			return new SingletonPrinter();
		} else {
			return instance;
		}
	}

	public void print() {
		System.out.println("Printing...");
	}
}
