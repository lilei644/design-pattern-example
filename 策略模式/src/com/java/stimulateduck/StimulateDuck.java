package com.java.stimulateduck;

import com.java.stimulateduck.duck.Duck;
import com.java.stimulateduck.duck.GreenHeadDuck;
import com.java.stimulateduck.duck.RedHeadDuck;
import com.java.stimulateduck.flybehavior.NoFlyBehavior;
import com.java.stimulateduck.quackbehavior.NoQuackBehavior;


/**
 * 策略模式改进后
 */
public class StimulateDuck {

	public static void main(String[] args) {

		Duck mGreenHeadDuck = new GreenHeadDuck();
		Duck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Fly();
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		mRedHeadDuck.Fly();
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.display();
		mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
		mRedHeadDuck.Fly();
		mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
		mRedHeadDuck.Quack();
	}

}
