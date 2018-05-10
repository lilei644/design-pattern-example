package com.java.facademode.hometheater;

/**
 * 灯光
 */
public class TheaterLights {

	private static TheaterLights instance = null;

	private TheaterLights() {

	}

	public static TheaterLights getInstance() {
		if (instance == null) {
			instance = new TheaterLights();
		}

		return instance;
	}

	public void on() {
		System.out.println("TheaterLights On");
	}

	public void off() {
		System.out.println("TheaterLights Off");
	}

	public void dim(int d) {
		System.out.println("TheaterLights dim to " + d + "%");
	}

	public void bright() {
		dim(100);
		System.out.println("TheaterLights bright");
	}
}
