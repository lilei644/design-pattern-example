package com.java.hexter.stimulateduck.oo;


/**
 * 利用OO思想封装的模式
 */
public class StimulateDuck {

	public static void main(String[] args) {

		GreenHeadDuck mGreenHeadDuck = new GreenHeadDuck();
		RedHeadDuck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Fly();
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();

		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.Fly();



	//	mGreenHeadDuck.Fly();
		//mRedHeadDuck.Fly();
	}

}
