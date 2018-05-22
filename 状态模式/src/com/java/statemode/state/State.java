package com.java.statemode.state;

/**
 * 状态模式，统一的状态接口，接口内实现不同状态下不同的处理行为
 */
public interface State {

    // 投入硬币
    public void insertCoin();

    // 退出硬币
    public void returnCoin();

    // 摇动把手
    public void turnCrank();

    // 掉出糖果
    public void dispense();

    // 打印当前状态
    public void printstate();
}
