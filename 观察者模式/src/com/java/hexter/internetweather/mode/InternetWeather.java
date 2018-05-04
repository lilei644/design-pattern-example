package com.java.hexter.internetweather.mode;


/**
 * 自定义的观察者模式示例
 */
public class InternetWeather {

	public static void main(String[] args) {
		
		CurrentConditions mCurrentConditions;
		ForcastConditions mForcastConditions;
		WeatherDataSt mWeatherDataSt;
		
		mWeatherDataSt=new WeatherDataSt();
		mCurrentConditions=new CurrentConditions();
		mForcastConditions=new ForcastConditions();
		
		mWeatherDataSt.registerObserver(mCurrentConditions);
		mWeatherDataSt.registerObserver(mForcastConditions);
		
		mWeatherDataSt.setData(30, 150, 40);
		mWeatherDataSt.removeObserver(mCurrentConditions);
		mWeatherDataSt.setData(40, 250, 50);
	}

}
