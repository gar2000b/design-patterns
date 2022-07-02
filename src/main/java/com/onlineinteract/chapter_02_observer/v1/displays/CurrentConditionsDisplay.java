package com.onlineinteract.chapter_02_observer.v1.displays;

import com.onlineinteract.chapter_02_observer.v1.displays.api.DisplayElement;
import com.onlineinteract.chapter_02_observer.v1.displays.api.Observer;
import com.onlineinteract.chapter_02_observer.v1.weather.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}