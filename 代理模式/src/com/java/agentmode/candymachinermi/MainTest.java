package com.java.agentmode.candymachinermi;

import java.rmi.Naming;

/**
 * 代理模式，模拟RMI客户端
 */
public class MainTest {

    public static void main(String[] args) {
        Monitor mMonitor = new Monitor();

        try {
            CandyMachineRemote mCandyMachine = (CandyMachineRemote) Naming
                    .lookup("rmi://127.0.0.1:6602/test1");
            mMonitor.addMachine(mCandyMachine);
            mCandyMachine = (CandyMachineRemote) Naming
                    .lookup("rmi://127.0.0.1:6602/test2");
            mMonitor.addMachine(mCandyMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }

        mMonitor.report();
    }

}
