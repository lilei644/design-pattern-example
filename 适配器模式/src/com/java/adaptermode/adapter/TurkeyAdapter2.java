package com.java.adaptermode.adapter;

import com.java.adaptermode.turkey.WildTurkey;
import com.java.adaptermode.duck.Duck;

/**
 * 适配器模式，类适配器
 */
public class TurkeyAdapter2 extends WildTurkey implements Duck {

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
    }
}
