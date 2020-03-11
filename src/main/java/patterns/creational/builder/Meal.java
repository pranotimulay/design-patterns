package main.java.patterns.creational.builder;

public class Meal {

	private String sandwich;
	private String sideItem;
	private String drink;
	private String offerItem;
	private Float price;

	public String getSandwich() {
		return sandwich;
	}

	public String getSideItem() {
		return sideItem;
	}

	public String getDrink() {
		return drink;
	}

	public String getOfferItem() {
		return offerItem;
	}

	public Float getPrice() {
		return price;
	}

	public void setSandwich(String sandwich) {
		this.sandwich = sandwich;
	}

	public void setSideItem(String sideItem) {
		this.sideItem = sideItem;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public void setOfferItem(String offerItem) {
		this.offerItem = offerItem;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meal [sandwich=");
		builder.append(sandwich);
		builder.append(", sideItem=");
		builder.append(sideItem);
		builder.append(", drink=");
		builder.append(drink);
		builder.append(", offerItem=");
		builder.append(offerItem);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
