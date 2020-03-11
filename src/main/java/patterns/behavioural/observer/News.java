package main.java.patterns.behavioural.observer;

import java.util.Observable;

public class News extends Observable {

	private String headline = null;

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
		setChanged();
		notifyObservers("extra information");
	}

}
