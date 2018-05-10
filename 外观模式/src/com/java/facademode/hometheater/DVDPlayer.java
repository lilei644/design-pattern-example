package com.java.facademode.hometheater;

/**
 * DVD播放器
 */
public class DVDPlayer {

    private static DVDPlayer instance = null;

    private DVDPlayer() {

    }

    public static DVDPlayer getInstance() {
        if (instance == null) {
            instance = new DVDPlayer();
        }

        return instance;
    }

    public void on() {
        System.out.println("DVDPlayer On");
    }

    public void off() {
        System.out.println("DVDPlayer Off");
    }

    public void play() {
        System.out.println("DVDPlayer is playing");
    }

    public void pause() {
        System.out.println("DVDPlayer  pause");
    }

    public void setdvd() {
        System.out.println("DVDPlayer  is setting dvd");
    }
}
