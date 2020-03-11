package main.java.patterns.structural.decorator;

/**
 * 
 * @author Pranoti Mulay a decorator class implementation that adds chocolate
 *         crush to the cake
 */

public class ChocolateCrush extends CakeDecorator {

	public ChocolateCrush(AbstractCake cake) {
		super(cake);
	}

	@Override
	public double getCost() {
		return super.getCost() + 3;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + ", Chocolate Crush";
	}

}
