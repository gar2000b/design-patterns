package com.onlineinteract.chapter_01_strategy.model;

import com.onlineinteract.chapter_01_strategy.behavior.FlyWithWings;
import com.onlineinteract.chapter_01_strategy.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck!");
	}
}
