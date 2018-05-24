package com.java.agentmode.candymachine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.java.agentmode.candymachinermi.CandyMachineRemote;

/**
 * 代理模式，结合状态模式，集成RMI服务，实现定义的服务方法
 */
public class CandyMachine extends UnicastRemoteObject implements CandyMachineRemote {

    State mSoldOutState;
    State mOnReadyState;
    State mHasCoin;
    State mSoldState;
    State mWinnerState;
    private String location = "";
    private State state;
    private int count = 0;

    public CandyMachine(String location, int count) throws RemoteException {
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setState(State state) {
        this.state = state;
    }

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

    public State getstate() {
        return state;
    }
}
