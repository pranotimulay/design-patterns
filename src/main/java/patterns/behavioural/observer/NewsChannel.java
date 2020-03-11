package main.java.patterns.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

public class NewsChannel implements Observer {

	@Override
	public void update(Observable o, Object arg1) {
		News news = (News) o;
		System.out.println("Got news via news channel: " + news.getHeadline());
	}

}
