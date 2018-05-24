package com.java.agentmode.candymachinermi;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * 代理模式
 */
public class Monitor {

    private ArrayList<CandyMachineRemote> candyMachinelst;

    public Monitor() {
        candyMachinelst = new ArrayList<CandyMachineRemote>();
    }

    public void addMachine(CandyMachineRemote mCandyMachine) {
        candyMachinelst.add(mCandyMachine);
    }

    public void report() {
        CandyMachineRemote mCandyMachine;
        for (int i = 0, len = candyMachinelst.size(); i < len; i++) {
            mCandyMachine = candyMachinelst.get(i);
            try {
                System.out.println("Machine Loc:" + mCandyMachine.getLocation());

                System.out.println("Machine Candy count:" + mCandyMachine.getCount());
                System.out.println("Machine State:" + mCandyMachine.getstate().getstatename());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

    }

}
