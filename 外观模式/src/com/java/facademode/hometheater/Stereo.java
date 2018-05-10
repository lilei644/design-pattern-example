package com.java.facademode.hometheater;

/**
 * 音响
 */
public class Stereo {

	private static Stereo instance = null;
	private int volume = 5;

	private Stereo() {

	}

	public static Stereo getInstance() {
		if (instance == null) {
			instance = new Stereo();
		}

		return instance;
	}

	public void on() {
		System.out.println("Stereo On");
	}

	public void off() {
		System.out.println("Stereo Off");
	}

	public void setVolume(int vol) {

		volume = vol;
		System.out.println("the volume of Stereo is set to  " + volume);
	}

	public void addVolume() {
		if (volume < 11) {
			volume++;
			setVolume(volume);
		}

	}

	public void subVolume() {
		if (volume > 0) {
			volume--;
			setVolume(volume);
		}

	}

}
