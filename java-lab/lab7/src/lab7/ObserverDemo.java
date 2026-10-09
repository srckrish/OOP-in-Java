package lab7;

import java.util.*;

interface Observer {
	void update(String news);
}

class Subscriber implements Observer {
	String name;

	Subscriber(String name) {
		this.name = name;
	}

	public void update(String news) {
		System.out.println(name + " received news: " + news);
	}
}

class NewsAgency {
	private List<Observer> subscribers = new ArrayList<>();

	// Add subscriber
	void addSubscriber(Observer subscriber) {
		subscribers.add(subscriber);
	}

	// Publish news
	void publishNews(String news) {
		System.out.println("News published: " + news);

		// Notify all subscribers
		for (Observer subscriber : subscribers) {
			subscriber.update(news);
		}
	}
}

public class ObserverDemo {
	public static void main(String[] args) {

		NewsAgency agency = new NewsAgency();

		Subscriber s1 = new Subscriber("Ram");
		Subscriber s2 = new Subscriber("Sita");

		agency.addSubscriber(s1);
		agency.addSubscriber(s2);

		agency.publishNews("Nepal wins the match.");
	}
}