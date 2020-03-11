package main.java.patterns.creational.builder;

//Defines a specific order/algorithm in which the builder class methods should be called

public class MealDirector {

	public void prepareMeal(MealBuilder builder) {
		builder.addSandwich();
		builder.addSideOrder();
		builder.addDrink();
		builder.addOfferItem();
		builder.setPrice();
	}

}
