package main.java.patterns.creational.builder;

public abstract class MealBuilder {

	public abstract void addSandwich();

	public abstract void addSideOrder();

	public abstract void addDrink();

	public abstract void addOfferItem();

	public abstract void setPrice();

	public abstract Meal getMeal();

}
