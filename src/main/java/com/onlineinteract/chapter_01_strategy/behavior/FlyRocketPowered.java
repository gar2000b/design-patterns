package com.onlineinteract.chapter_01_strategy.behavior;

import com.onlineinteract.chapter_01_strategy.behavior.api.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}