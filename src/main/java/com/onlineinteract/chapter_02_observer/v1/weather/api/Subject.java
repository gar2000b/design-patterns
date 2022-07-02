package com.onlineinteract.chapter_02_observer.v1.weather.api;

import com.onlineinteract.chapter_02_observer.v1.displays.api.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
