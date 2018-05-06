package com.java.internetweather;


/**
 * 传统面向对象模式，第三方显示模块，被气象总部模块调用刷新方法
 */
public class CurrentConditions {
	
	private float mTemperature;
	private float mPressure;
	private float mHumidity;
	
	public void update(float mTemperature,float mPressure,float mHumidity)
	{
		this.mTemperature=mTemperature;
		this.mPressure=mPressure;
		this.mHumidity=mHumidity;
		display();
	}
	
	public void display()
	{
		System.out.println("***Today mTemperature: "+mTemperature+"***");
		System.out.println("***Today mPressure: "+mPressure+"***");
		System.out.println("***Today mHumidity: "+mHumidity+"***");
	}
}
