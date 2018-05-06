package com.java.internetweather.observer;

/**
 * 自定义被观察者
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
