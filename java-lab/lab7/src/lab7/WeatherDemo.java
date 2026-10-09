package lab7;

import java.util.ArrayList;
import java.util.List;

interface WeatherObserver {
	void update(float temperature, float humidity);
}

class WeatherData {

	private List<WeatherObserver> observers = new ArrayList<>();

	public void addObserver(WeatherObserver observer) {
		observers.add(observer);
	}

	public void setWeather(float temperature, float humidity) {
		for (WeatherObserver observer : observers) {
			observer.update(temperature, humidity);
		}
	}
}

class CurrentConditionsDisplay implements WeatherObserver {

	public void update(float temperature, float humidity) {
		System.out.println("Current Conditions:");
		System.out.println("Temperature: " + temperature + " C");
		System.out.println("Humidity: " + humidity + "%");
	}
}

class StatisticsDisplay implements WeatherObserver {

	private float max = 0;
	private float min = 100;

	public void update(float temperature, float humidity) {

		if (temperature > max) {
			max = temperature;
		}

		if (temperature < min) {
			min = temperature;
		}

		System.out.println("Statistics:");
		System.out.println("Maximum: " + max + " C");
		System.out.println("Minimum: " + min + " C");
	}
}

class ForecastDisplay implements WeatherObserver {

	public void update(float temperature, float humidity) {

		System.out.println("Forecast:");

		if (temperature > 30) {
			System.out.println("Hot weather expected.");
		} else {
			System.out.println("Normal weather expected.");
		}
	}
}

public class WeatherDemo {

	public static void main(String[] args) {

		WeatherData weather = new WeatherData();

		CurrentConditionsDisplay current = new CurrentConditionsDisplay();

		StatisticsDisplay statistics = new StatisticsDisplay();

		ForecastDisplay forecast = new ForecastDisplay();

		weather.addObserver(current);
		weather.addObserver(statistics);
		weather.addObserver(forecast);

		weather.setWeather(32, 70);

		System.out.println();

		weather.setWeather(28, 65);
	}
}