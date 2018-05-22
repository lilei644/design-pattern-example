package com.java.statemode.state;

/**
 * 状态模式，糖果机内只定义状态接口对象，在接口内部给糖果机的状态赋值
 */
public class CandyMachine {

    State mSoldOutState;
    State mOnReadyState;
    State mHasCoin;
    State mSoldState;
    State mWinnerState;
    private State state;
    private int count = 0;

    public CandyMachine(int count) {
        this.count = count;
        mSoldOutState = new SoldOutState(this);
        mOnReadyState = new OnReadyState(this);
        mHasCoin = new HasCoin(this);
        mSoldState = new SoldState(this);
        mWinnerState = new WinnerState(this);
        if (count > 0) {
            state = mOnReadyState;
        } else {
            state = mSoldOutState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 糖果机的一切状态都直接调用状态接口内部的方法
     */
    public void insertCoin() {
        state.insertCoin();
    }

    public void returnCoin() {
        state.returnCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseCandy() {
        if (count > 0) {
            count = count - 1;
            System.out.println("a candy rolling out!");
        }

    }

    public int getCount() {
        return count;
    }

    public void printstate() {
        state.printstate();
    }
}
