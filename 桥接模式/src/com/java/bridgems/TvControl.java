package com.java.bridgems;

/**
 * 面向对象模式，所有遥控器统一的界面，界面上定义3个统一的按钮
 */
public interface TvControl {

    public void Onoff();

    public void nextChannel();

    public void preChannel();
}
