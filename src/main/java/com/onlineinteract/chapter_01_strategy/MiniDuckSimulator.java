package com.onlineinteract.chapter_01_strategy;

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

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
