package com.java.bridgems.control;

/**
 * 桥接模式，将遥控器所有需要用到的方法进行统一定义
 */
public interface Control {

    public void On();

    public void Off();

    public void setChannel(int ch);

    public void setVolume(int vol);

}
