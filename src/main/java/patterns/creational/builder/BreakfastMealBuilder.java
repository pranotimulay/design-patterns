package main.java.patterns.creational.builder;

public class BreakfastMealBuilder extends MealBuilder {

	Meal breakfastMeal = new Meal();

	@Override
	public void addSandwich() {
		breakfastMeal.setSandwich("breakfast sandwich");
	}

	@Override
	public void addSideOrder() {
		breakfastMeal.setSideItem("salad");
	}

	@Override
	public void addDrink() {
		breakfastMeal.setDrink("orange juice");
	}

	@Override
	public void addOfferItem() {
		breakfastMeal.setOfferItem("granola bar");
	}

	@Override
	public void setPrice() {
		breakfastMeal.setPrice(5.50F);

	}

	@Override
	public Meal getMeal() {
		return breakfastMeal;
	}

}
