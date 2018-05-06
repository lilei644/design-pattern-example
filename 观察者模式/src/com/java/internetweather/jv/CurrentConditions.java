package com.java.internetweather.jv;

import java.util.Observable;
import java.util.Observer;

import com.java.internetweather.jv.WeatherData.Data;


/**
 * java内置的观察者，第三方显示模块
 */
public class CurrentConditions implements Observer {
	
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		this.mTemperatrue=((Data)(arg1)).mTemperatrue;
		this.mPressure=((Data)(arg1)).mPressure;
		this.mHumidity=((Data)(arg1)).mHumidity;
		display();
	}
	
	public void display()
	{
		System.out.println("***Today mTemperatrue:" +mTemperatrue+"***");
		System.out.println("***Today mPressure:" +mPressure+"***");
		System.out.println("***Today mHumidity:" +mHumidity+"***");
	}
	
	
}
