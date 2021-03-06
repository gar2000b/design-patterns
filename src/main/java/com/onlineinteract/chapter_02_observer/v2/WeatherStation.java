package com.onlineinteract.chapter_02_observer.v2;

import com.onlineinteract.chapter_02_observer.v2.displays.CurrentConditionsDisplay;
import com.onlineinteract.chapter_02_observer.v2.displays.ForecastDisplay;
import com.onlineinteract.chapter_02_observer.v2.displays.HeatIndexDisplay;
import com.onlineinteract.chapter_02_observer.v2.displays.StatisticsDisplay;
import com.onlineinteract.chapter_02_observer.v2.weather.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

//		weatherData.removeObserver(forecastDisplay);
//		weatherData.setMeasurements(62, 90, 28.1f);
	}
}