package main.java.patterns.creational.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String type) {

		if (type.equals("MAMMAL")) {
			return new MammalFactory();
		} else if (type.equals("INSECT")) {
			return new InsectFactory();
		}

		return null;
	}

}
