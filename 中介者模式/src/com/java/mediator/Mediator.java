package com.java.mediator;

/**
 * 中介者模式，中介者的接口，用于注册加入中介，发送消息和接收消息
 */
public interface Mediator {
    public abstract void Register(String colleagueName, Colleague colleague);

    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}
