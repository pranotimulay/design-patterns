package main.java.patterns.creational.abstractfactory;

public class MammalFactory extends AbstractFactory {

	@Override
	Animal getAnimal(String type) {

		if (type.equals("MONKEY")) {
			return new Monkey();
		}
		if (type.equals("TIGER")) {
			return new Tiger();
		}

		return null;
	}

}
