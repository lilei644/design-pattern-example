package com.java.agentmode.rmi;

import java.rmi.Naming;

/**
 * RMI客户端，远程连接服务端，调用远程服务
 */
public class MyRemoteClient {
    public static void main(String[] args) {

        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:6600/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
