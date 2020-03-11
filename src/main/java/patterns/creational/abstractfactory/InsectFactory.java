package main.java.patterns.creational.abstractfactory;

public class InsectFactory extends AbstractFactory {

	@Override
	Animal getAnimal(String type) {

		if (type.equals("MOTH")) {
			return new Moth();
		}
		if (type.equals("ANT")) {
			return new Ant();
		}
		return null;
	}

}
