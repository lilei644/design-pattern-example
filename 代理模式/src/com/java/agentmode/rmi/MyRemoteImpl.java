package com.java.agentmode.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * RMI服务端，实现接口方法，提供服务
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello World!";
    }

    public static void main(String[] args) {

        try {
            MyRemote service = new MyRemoteImpl();
            // LocateRegistry.createRegistry(6600);
            Naming.rebind("rmi://101.232.197.163:6600/RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }


    }
}
