package main.java.patterns.structural.decorator;

/**
 * 
 * @author Pranoti Mulay a decorator class implementation that adds sprinkles to
 *         the cake
 */
public class Sprinkles extends CakeDecorator {

	public Sprinkles(AbstractCake cake) {
		super(cake);
	}

	@Override
	public double getCost() {
		return super.getCost() + 2;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + ", Sprinkles";
	}

}
