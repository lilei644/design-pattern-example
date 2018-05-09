package com.java.adaptermode.turkey;

/**
 * 火鸡
 */
public class WildTurkey implements Turkey {

    /**
     * 火鸡是go go 叫
     */
    @Override
    public void gobble() {
        System.out.println(" Go Go");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }

}
