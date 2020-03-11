package main.java.patterns.behavioural.strategy;

public class PaymentMaker {

	private AbstractPaymentStrategy paymentStrategy;

	public void setPaymentStrategy(AbstractPaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void executePaymentStrategy() {
		paymentStrategy.pay();
	}

}
