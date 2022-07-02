package com.onlineinteract.chapter_02_observer.v1.displays.api;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
