package com.java.agentmode.candymachinermi;

import java.rmi.Naming;

import com.java.agentmode.candymachine.CandyMachine;

/**
 * 搭理模式，模拟RMI的客户端
 */
public class RemoteMainTest {
    public static void main(String[] args) {

        try {
            CandyMachine service = new CandyMachine("test1", 7);
            // LocateRegistry.createRegistry(6602);
            Naming.rebind("rmi://127.0.0.1:6602/test1", service);
            service.insertCoin();
            service = new CandyMachine("test2", 5);
            Naming.rebind("rmi://127.0.0.1:6602/test2", service);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }

    }
}
