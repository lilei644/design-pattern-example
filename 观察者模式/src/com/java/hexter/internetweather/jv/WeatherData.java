package com.java.hexter.internetweather.jv;

import java.util.Observable;

/**
 * java内置的观察者模式，被观察者，气象总部数据
 */
public class WeatherData extends Observable{
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	
	public float getTemperature()
	{
		return mTemperatrue;
		
	}
	
	public float getPressure()
	{
		return mPressure;
		
	}
	
	public float getHumidity()
	{
		return mHumidity;
		
	}
	
	
	public void dataChange()
	{
		// 采用推送修改数据的通知方式
		this.setChanged();
		this.notifyObservers(new Data(getTemperature(),getPressure(),getHumidity()));
		
	}
	
	
	public void setData(float mTemperatrue,float mPressure,float mHumidity)
	{
		this.mTemperatrue=mTemperatrue;
		this.mPressure=mPressure;
		this.mHumidity=mHumidity;
		dataChange();
	}
	
	public class Data
	{
		public float mTemperatrue;
		public float mPressure;
		public float mHumidity;
		public Data(float mTemperatrue,float mPressure,float mHumidity)
		{
			this.mTemperatrue=mTemperatrue;
			this.mPressure=mPressure;
			this.mHumidity=mHumidity;
		}
	}
	
}
