package com.java.mediator;

/**
 * 中介者模式，各组件实现的抽象类
 */
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
