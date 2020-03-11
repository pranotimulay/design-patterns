package main.java.patterns.structural.decorator;

public class ChocolateCake extends AbstractCake {

	@Override
	public double getCost() {
		return 6.5;
	}

	@Override
	public String getIngredients() {
		return "Chocolate, Chocochips, Cream, Bread";
	}

}
