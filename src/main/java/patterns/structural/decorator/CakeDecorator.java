package main.java.patterns.structural.decorator;

/**
 * 
 * @author Pranoti Mulay this is the decorator abstract class that is to be
 *         extended by various cake decorators
 */

public abstract class CakeDecorator extends AbstractCake {

	protected AbstractCake cake = null;

	public CakeDecorator(AbstractCake cake) {
		this.cake = cake;
	}

	@Override
	public double getCost() {
		return cake.getCost();
	}

	@Override
	public String getIngredients() {
		return cake.getIngredients();
	}

}
