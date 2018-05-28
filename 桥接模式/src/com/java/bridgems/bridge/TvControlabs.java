package com.java.bridgems.bridge;

import com.java.bridgems.control.Control;

/**
 * 桥接模式，桥接的抽象类，定义基本的抽象方法可桥接对象
 */
public abstract class TvControlabs {

    Control mControl = null;

    public TvControlabs(Control mControl) {
        this.mControl = mControl;
    }

    public abstract void Onoff();

    public abstract void nextChannel();

    public abstract void preChannel();


}
