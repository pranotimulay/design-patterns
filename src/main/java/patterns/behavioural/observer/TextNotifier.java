package main.java.patterns.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

public class TextNotifier implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		News news = (News) o;
		System.out.println("Got news via text notifier: " + news.getHeadline());

	}

}
