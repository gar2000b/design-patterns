package com.onlineinteract.chapter_01_strategy.behavior;

import com.onlineinteract.chapter_01_strategy.behavior.api.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}
