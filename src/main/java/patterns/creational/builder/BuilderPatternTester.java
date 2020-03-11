package main.java.patterns.creational.builder;

import java.util.Scanner;

public class BuilderPatternTester {

	public static void main(String[] args) {

		System.out.println("Your meal type? DINNER/BREAKFAST");
		MealDirector mealDirector = new MealDirector();
		Scanner scanner = new Scanner(System.in);
		String mealType = scanner.nextLine();
		MealBuilder mealBuilder = null;
		if (mealType.equals("DINNER")) {
			mealBuilder = new DinnerMealBuilder();
		} else {
			mealBuilder = new BreakfastMealBuilder();
		}

		mealDirector.prepareMeal(mealBuilder);
		Meal finalMeal = mealBuilder.getMeal();
		System.out.println("Your order: " + finalMeal);
		scanner.close();
	}

}
