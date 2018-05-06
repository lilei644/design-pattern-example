package com.java.internetweather;


/**
 * 传统面向对象方式，气象总部数据，有数据更新则调用内部的第三方模块的update方法
 */
public class WeatherData {
	
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	private CurrentConditions mCurrentConditions;

	public WeatherData(CurrentConditions mCurrentConditions)
	{
	this. mCurrentConditions= mCurrentConditions;
	}
	
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
		mCurrentConditions.update(getTemperature(), getPressure(), getHumidity());
		}
	
	public void setData(float mTemperature,float mPressure,float mHumidity)
	{
		this.mTemperatrue=mTemperature;
		this.mPressure=mPressure;
		this.mHumidity=mHumidity;
		dataChange();
	}
	
}
