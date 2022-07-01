package com.onlineinteract.chapter_01_strategy.model;

import com.onlineinteract.chapter_01_strategy.behavior.FlyNoWay;
import com.onlineinteract.chapter_01_strategy.behavior.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
