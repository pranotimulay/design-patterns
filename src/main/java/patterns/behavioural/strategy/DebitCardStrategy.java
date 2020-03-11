package main.java.patterns.behavioural.strategy;

public class DebitCardStrategy extends AbstractPaymentStrategy {

	@Override
	public void pay() {
		System.out.println("Paying using debit card");
	}

}
