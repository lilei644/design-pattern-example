package com.java.agentmode.candymachine;

/**
 * 状态模式，糖果机售罄的状态
 */
public class SoldOutState implements State {

    private transient CandyMachine mCandyMachine;

    public SoldOutState(CandyMachine mCandyMachine) {
        this.mCandyMachine = mCandyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("you can't insert coin,the machine sold out!");

    }

    @Override
    public void returnCoin() {
        System.out.println("you can't return,you haven't inserted a coin yet!");

    }

    @Override
    public void turnCrank() {
        System.out.println("you turned,but there are no candies!");

    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("***SoldOutState***");

    }

    @Override
    public String getstatename() {
        return "SoldOutState";
    }
}
