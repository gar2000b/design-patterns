package com.onlineinteract.chapter_01_strategy;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
