package com.onlineinteract.chapter_01_strategy.behavior;

import com.onlineinteract.chapter_01_strategy.behavior.api.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
