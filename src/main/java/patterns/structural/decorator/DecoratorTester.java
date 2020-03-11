package main.java.patterns.structural.decorator;

public class DecoratorTester {

	public static void main(String[] args) {

		AbstractCake chocolateCake = new ChocolateCake();
		System.out.println("Simple chocolate cake");
		System.out.println(chocolateCake.getCost());
		System.out.println(chocolateCake.getIngredients());

		System.out.println("Decorating.. Chocolate Cake with Sprikles");
		chocolateCake = new Sprinkles(chocolateCake);
		System.out.println(chocolateCake.getCost());
		System.out.println(chocolateCake.getIngredients());

		System.out.println("Decorating.. Chocolate Cake with Two Sprikles");
		chocolateCake = new Sprinkles(chocolateCake);
		System.out.println(chocolateCake.getCost());
		System.out.println(chocolateCake.getIngredients());

		System.out.println("Further decorating.. Chocolate Cake with Sprikles, Chocolate Crush");
		chocolateCake = new ChocolateCrush(chocolateCake);
		System.out.println(chocolateCake.getCost());
		System.out.println(chocolateCake.getIngredients());

		System.out.println("Simple Strawberry cake ");
		AbstractCake strawberryCake = new StrawberryCake();
		System.out.println(strawberryCake.getCost());
		System.out.println(strawberryCake.getIngredients());

		System.out.println("Decorating.. Strawberry Cake with Sprikles");
		strawberryCake = new Sprinkles(strawberryCake);
		System.out.println(strawberryCake.getCost());
		System.out.println(strawberryCake.getIngredients());

		System.out.println("Further decorating.. Strawberry Cake with Sprikles, Chocolate Crush");
		strawberryCake = new ChocolateCrush(strawberryCake);
		System.out.println(strawberryCake.getCost());
		System.out.println(strawberryCake.getIngredients());

	}

}
