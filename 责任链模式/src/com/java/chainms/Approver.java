package com.java.chainms;

/**
 * 责任链模式，管理者抽象对象，定义自己的处理内容和设置下一个责任链对象
 */
public abstract class Approver {
    Approver successor;
    String Name;

    public Approver(String Name) {
        this.Name = Name;
    }

    public abstract void ProcessRequest(PurchaseRequest request);

    public void SetSuccessor(Approver successor) {
        this.successor = successor;
    }
}
