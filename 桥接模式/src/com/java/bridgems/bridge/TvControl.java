package com.java.bridgems.bridge;

import com.java.bridgems.control.Control;

/**
 * 桥接模式，基础遥控器的方法实现
 */
public class TvControl extends TvControlabs {
    private int ch = 0;
    private boolean ison = false;

    public TvControl(Control mControl) {
        super(mControl);
    }

    @Override
    public void Onoff() {
        if (ison) {
            ison = false;
            mControl.Off();
        } else {
            ison = true;
            mControl.On();
        }

    }

    @Override
    public void nextChannel() {
        ch++;
        mControl.setChannel(ch);

    }

    @Override
    public void preChannel() {
        ch--;
        if (ch < 0) {
            ch = 200;
        }
        mControl.setChannel(ch);

    }

}
