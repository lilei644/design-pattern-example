package com.java.internetweather.observer;

/**
 * 自定义观察者
 */
public interface Observer {
	public void update(float mTemperatrue, float mPressure, float mHumidity);
}
