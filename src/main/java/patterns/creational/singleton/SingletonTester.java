package main.java.patterns.creational.singleton;

public class SingletonTester {

	public static void main(String[] args) {

		SingletonPrinter single = SingletonPrinter.getInstance();
		single.print();

	}

}
