package com.java.statemode.state;

/**
 * 状态模式，通过定义一个状态接口，接口内实现不同状态下不同的处理方式
 * 则调用处理方式时直接调用状态接口对象的实现方法
 * 使用状态模式可以是不同状态接互不影响，也可便于新增多种状态类型的需求
 */
public class MainTest {
    public static void main(String[] args) {
        CandyMachine mCandyMachine = new CandyMachine(6);

        mCandyMachine.printstate();

        mCandyMachine.insertCoin();
        mCandyMachine.printstate();

        mCandyMachine.turnCrank();

        mCandyMachine.printstate();

        mCandyMachine.insertCoin();
        mCandyMachine.printstate();

        mCandyMachine.turnCrank();

        mCandyMachine.printstate();
    }
}
