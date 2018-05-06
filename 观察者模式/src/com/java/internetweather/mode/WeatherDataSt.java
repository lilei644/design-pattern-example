package com.java.internetweather.mode;

import java.util.ArrayList;

import com.java.internetweather.observer.Observer;
import com.java.internetweather.observer.Subject;

/**
 * 自定义的观察者模式，被观察者
 */
public class WeatherDataSt implements Subject {
	
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	private ArrayList<Observer> mObservers;
	public WeatherDataSt()
	{
		mObservers=new ArrayList<Observer>();
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
		notifyObservers();
	}

	

	
	
	
	public void setData(float mTemperatrue,float mPressure,float mHumidity)
	{
		this.mTemperatrue=mTemperatrue;
		this.mPressure=mPressure;
		this.mHumidity=mHumidity;
		dataChange();
	}

	@Override
	public void registerObserver(Observer o) {
		mObservers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if(mObservers.contains(o))
		{mObservers.remove(o);}
	}

	@Override
	public void notifyObservers() {
		for(int i=0,len=mObservers.size();i<len;i++)
		{
			mObservers.get(i).update(getTemperature(), getPressure(), getHumidity());
		}
	}

}
