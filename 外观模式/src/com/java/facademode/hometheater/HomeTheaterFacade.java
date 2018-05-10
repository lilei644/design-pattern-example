package com.java.facademode.hometheater;

/**
 * 外观模式，统一封装提供给外部使用的接口程序
 */
public class HomeTheaterFacade {
    private TheaterLights mTheaterLights;
    private Popcorn mPopcorn;
    private Stereo mStereo;
    private Projector mProjector;
    private Screen mScreen;
    private DVDPlayer mDVDPlayer;

    public HomeTheaterFacade() {
        mTheaterLights = TheaterLights.getInstance();
        mPopcorn = Popcorn.getInstance();
        mStereo = Stereo.getInstance();
        mProjector = Projector.getInstance();
        mScreen = Screen.getInstance();
        mDVDPlayer = DVDPlayer.getInstance();
    }

    /**
     * 组合多项功能，给外部透出一个总控制的方法
     */
    public void ready() {
        mPopcorn.on();
        mPopcorn.pop();
        mScreen.down();
        mProjector.on();
        mStereo.on();
        mDVDPlayer.on();
        mDVDPlayer.setdvd();
        mTheaterLights.dim(10);
    }

    public void end() {
        mPopcorn.off();
        mTheaterLights.bright();
        mScreen.up();
        mProjector.off();
        mStereo.off();

        mDVDPlayer.setdvd();
        mDVDPlayer.off();

    }

    public void play() {
        mDVDPlayer.play();
    }

    public void pause() {
        mDVDPlayer.pause();
    }
}
