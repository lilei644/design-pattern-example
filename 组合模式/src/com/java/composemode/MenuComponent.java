package com.java.composemode;

import java.util.Iterator;

/**
 * 组合对象的超类，被所有子类继承，相当于统一的节点属性
 */
public abstract class MenuComponent {

    public String getName() {
        return "";
    }

    public String getDescription() {
        return "";
    }

    public float getPrice() {
        return 0;
    }

    public boolean isVegetable() {
        return false;
    }

    public abstract void print();

    public Iterator getIterator() {
        return new NullIterator();
    }
}
