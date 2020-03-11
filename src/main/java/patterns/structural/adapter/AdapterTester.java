package main.java.patterns.structural.adapter;

public class AdapterTester {

	public static void main(String[] args) {

		RoundScrew roundScrew = new RoundScrew();
		SquareScrew squareScrew = new SquareScrew();

		SquareToRoundAdapter adapter = new SquareToRoundAdapter(roundScrew);
		squareScrew.insert();
		adapter.insert();

	}

}
