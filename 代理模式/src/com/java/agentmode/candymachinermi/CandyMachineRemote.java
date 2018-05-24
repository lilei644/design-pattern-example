package com.java.agentmode.candymachinermi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.java.agentmode.candymachine.State;

/**
 * 代理模式，定义RMI远程调用的服务接口
 */
public interface CandyMachineRemote extends Remote {

    public String getLocation() throws RemoteException;

    public int getCount() throws RemoteException;

    public State getstate() throws RemoteException;
    
}
