package com.onlineinteract.chapter_02_observer.v2.displays;

import com.onlineinteract.chapter_02_observer.v2.displays.api.DisplayElement;
import com.onlineinteract.chapter_02_observer.v2.displays.api.Observer;
import com.onlineinteract.chapter_02_observer.v2.weather.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update() {
		tempSum += weatherData.getTemperature();
		numReadings++;

		if (weatherData.getTemperature() > maxTemp) {
			maxTemp = weatherData.getTemperature();
		}

		if (weatherData.getTemperature() < minTemp) {
			minTemp = weatherData.getTemperature();
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}
}