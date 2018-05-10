package com.java.facademode.hometheater;

/**
 * 放映机
 */
public class Projector {
	private int size=5;

	private static Projector instance = null;

	private Projector() {

	}

	public static Projector getInstance() {
		if (instance == null) {
			instance = new Projector();
		}

		return instance;
	}
	
	public void on() {
		System.out.println("Projector On");
	}

	public void off() {
		System.out.println("Projector Off");
	}

	public void focus() {
		System.out.println("Popcorn is focus");
	}
	
	public void zoom(int size) {
		this.size=size;
		System.out.println("Popcorn zoom to"+size);
	}
	
}
