package main.java.patterns.structural.adapter;

public class SquareToRoundAdapter extends SquareScrew {

	private RoundScrew roundScrew;

	public SquareToRoundAdapter(RoundScrew roundScrew) {
		this.roundScrew = roundScrew;
	}

	@Override
	public void insert() {
		roundScrew.insertRoundScrew();
	}

}
