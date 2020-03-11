package main.java.patterns.creational.builder;

public class DinnerMealBuilder extends MealBuilder {

	Meal dinnerMeal = new Meal();

	@Override
	public void addSandwich() {
		dinnerMeal.setSandwich("dinner sandwich");
	}

	@Override
	public void addSideOrder() {
		dinnerMeal.setSideItem("french fries");
	}

	@Override
	public void addDrink() {
		dinnerMeal.setDrink("coke");
	}

	@Override
	public void addOfferItem() {
		dinnerMeal.setOfferItem("chocochip muffin");
	}

	@Override
	public void setPrice() {
		dinnerMeal.setPrice(10.55F);

	}

	@Override
	public Meal getMeal() {
		return dinnerMeal;
	}

}
