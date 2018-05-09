package com.java.adaptermode.duck;

/**
 * 绿头鸭
 */
public class GreenHeadDuck implements Duck {

    /**
     * 鸭子是 ga ga 叫
     */
    @Override
    public void quack() {
        System.out.println(" Ga Ga");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a long distance");
    }

}
