package com.java.bridgems;

import com.java.bridgems.control.LGControl;

/**
 * 面向对象模式，定义厂家的遥控器对象，实现厂家制定的遥控器方法
 */
public class LGTvControl extends LGControl implements TvControl {
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
