package main.java.patterns.behavioural.strategy;

public class CreditCardStrategy extends AbstractPaymentStrategy {

	@Override
	public void pay() {
		System.out.println("Paying using credit card");
	}

}
