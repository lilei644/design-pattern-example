package com.java.bridgems.bridge;

import com.java.bridgems.control.Control;

/**
 * 桥接模式，新电视机类型，实现基础抽象方法，以及新型的遥控器的方法
 */
public class newTvControl extends TvControlabs {
    private int ch = 0;
    private boolean ison = false;
    private int prech = 0;

    public newTvControl(Control mControl) {
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
        prech = ch;
        ch++;
        mControl.setChannel(ch);

    }

    @Override
    public void preChannel() {
        prech = ch;
        ch--;
        if (ch < 0) {
            ch = 200;
        }
        mControl.setChannel(ch);

    }


    public void setChannel(int nch) {
        prech = ch;
        ch = nch;
        mControl.setChannel(ch);

    }

    public void Back() {
        mControl.setChannel(prech);
    }
}
