package main.java.patterns.behavioural.observer;

public class ObserverTester {

	public static void main(String[] args) {
		News news = new News();
		news.addObserver(new TextNotifier());
		news.addObserver(new NewsChannel());
		news.setHeadline("Breaking news: DH823YG3");
	}

}
