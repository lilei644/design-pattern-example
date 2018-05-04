package com.java.hexter.internetweather.mode;

import com.java.hexter.internetweather.observer.Observer;

/**
 * 自定义的观察者
 */
public class CurrentConditions implements Observer {

	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;

	@Override
	public void update(float mTemperatrue, float mPressure, float mHumidity) {
		// TODO Auto-generated method stub
		this.mHumidity = mHumidity;
		this.mPressure = mPressure;
		this.mTemperatrue = mTemperatrue;
		display();
	}

	public void display() {
		System.out.println("***Today mTemperatrue:" + mTemperatrue + "***");
		System.out.println("***Today mPressure:" + mPressure + "***");
		System.out.println("***Today mHumidity:" + mHumidity + "***");

	}

}