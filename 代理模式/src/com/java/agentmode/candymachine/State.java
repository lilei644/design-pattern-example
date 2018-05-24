package com.java.agentmode.candymachine;

import java.io.Serializable;

/**
 * 状态模式，定义统一的状态接口方法，实现序列化用于代理模式
 */
public interface State extends Serializable {
    public void insertCoin();

    public void returnCoin();

    public void turnCrank();

    public void dispense();

    public void printstate();

    public String getstatename();
}
