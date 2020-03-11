package main.java.patterns.behavioural.strategy;

import java.util.Scanner;

public class StrategyTester {

	public static void main(String[] args) {
		PaymentMaker paymentMaker = new PaymentMaker();
		System.out.println("Your payment option?(C/D)");

		Scanner scanner = new Scanner(System.in);
		String paymentOption = scanner.nextLine();

		if (paymentOption.equals("C")) {
			System.out.println("You selected credit card payment");
			paymentMaker.setPaymentStrategy(new CreditCardStrategy());
		} else {
			System.out.println("You selected debit card payment");
			paymentMaker.setPaymentStrategy(new DebitCardStrategy());
		}
		paymentMaker.executePaymentStrategy();

		scanner.close();
	}

}
