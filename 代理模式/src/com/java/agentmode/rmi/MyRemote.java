package com.java.agentmode.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 定义服务的接口，继承RMI的远程协议
 */
public interface MyRemote extends Remote{

	public String sayHello() throws RemoteException;
	
}
