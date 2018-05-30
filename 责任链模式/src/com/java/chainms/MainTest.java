package com.java.chainms;


/**
 * 责任链模式，将任务的处理封装层一个个对象，实现处理之间解耦，一层一层的往下传
 */
public class MainTest {

	public static void main(String[] args) {
		
		Client mClient=new Client();
		Approver GroupLeader=new GroupApprover("Tom");
		Approver DepartmentLeader=new DepartmentApprover("Jerry");
		Approver VicePresident=new VicePresidentApprover("Kate");
		Approver President=new PresidentApprover("Bush");
		
		GroupLeader.SetSuccessor(VicePresident);
		DepartmentLeader.SetSuccessor(President);
		VicePresident.SetSuccessor(DepartmentLeader);
		President.SetSuccessor(GroupLeader);
		
		VicePresident.ProcessRequest(mClient.sendRequst(1, 100, 40));
		VicePresident.ProcessRequest(mClient.sendRequst(2, 200, 40));
		VicePresident.ProcessRequest(mClient.sendRequst(3, 300, 40));
		VicePresident.ProcessRequest(mClient.sendRequst(4, 400, 140));
	}
}
