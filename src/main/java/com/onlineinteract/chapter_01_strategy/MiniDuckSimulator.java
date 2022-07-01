package com.onlineinteract.chapter_01_strategy;

import com.onlineinteract.chapter_01_strategy.behavior.FlyRocketPowered;
import com.onlineinteract.chapter_01_strategy.model.Duck;
import com.onlineinteract.chapter_01_strategy.model.MallardDuck;
import com.onlineinteract.chapter_01_strategy.model.ModelDuck;

/**
 * 
 * This simulator makes use of the Strategy Pattern
 * 
 * @author gar20
 *
 */
public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		System.out.println();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.swim();
	}
}
