package com.java.adaptermode.adapter;

import com.java.adaptermode.duck.Duck;
import com.java.adaptermode.turkey.Turkey;

/**
 * 适配器模式，对象适配器
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * 实现鸭子的叫声方法
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 实现鸭子的飞行方法
     */
    @Override
    public void fly() {
        for (int i = 0; i < 6; i++) {
            turkey.fly();
        }
    }
}
