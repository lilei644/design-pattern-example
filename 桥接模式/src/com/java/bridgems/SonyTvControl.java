package com.java.bridgems;

import com.java.bridgems.control.SonyControl;

/**
 * 面向对象模式，不同厂家在遥控器的按钮上实现该品牌自身的方法
 */
public class SonyTvControl extends SonyControl implements TvControl {
    private static int ch = 0;
    private static boolean ison = false;

    public void Onoff() {
        if (ison) {
            ison = false;
            super.Off();
        } else {
            ison = true;
            super.On();
        }
    }

    public void nextChannel() {
        ch++;
        super.setChannel(ch);
    }

    public void preChannel() {
        ch--;
        if (ch < 0) {
            ch = 200;
        }
        super.setChannel(ch);
    }

}
