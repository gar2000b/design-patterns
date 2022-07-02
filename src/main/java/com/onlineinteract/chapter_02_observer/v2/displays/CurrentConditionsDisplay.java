package com.onlineinteract.chapter_02_observer.v2.displays;

import com.onlineinteract.chapter_02_observer.v2.displays.api.DisplayElement;
import com.onlineinteract.chapter_02_observer.v2.displays.api.Observer;
import com.onlineinteract.chapter_02_observer.v2.weather.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}