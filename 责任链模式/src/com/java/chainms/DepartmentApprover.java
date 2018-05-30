package com.java.chainms;

/**
 * 责任链模式，部门经理的责任，不在权限范围内就往下传
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String Name) {
        super(Name + " DepartmentLeader");

    }

    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if ((5000 <= request.GetSum()) && (request.GetSum() < 10000)) {
            System.out.println("**This request " + request.GetID()
                    + " will be handled by " + this.Name + " **");
        } else {
            successor.ProcessRequest(request);
        }

    }

}
