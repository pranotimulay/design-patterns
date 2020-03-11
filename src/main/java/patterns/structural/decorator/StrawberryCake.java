package main.java.patterns.structural.decorator;

public class StrawberryCake extends AbstractCake {

	@Override
	public double getCost() {
		return 5.5;
	}

	@Override
	public String getIngredients() {
		return "Strawberries, Cream, Bread";
	}

}
