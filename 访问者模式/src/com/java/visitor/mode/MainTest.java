package com.java.visitor.mode;

/**
 * 访问者模式，将传统模式中数据的管理和操作拆分，将对象定义成需要访问的对象
 * 不同的操作只需实现访问者的接口实现自定义的访问方法即可
 * 实现了对象与操作之间的解耦，并且不同的操作方法之间互不干扰
 */
public class MainTest {
	public static void main(String[] args) {
		Employees mEmployees = new Employees();

		mEmployees.Attach(new Employee("Tom", 4500, 8, 1));
		mEmployees.Attach(new Employee("Jerry", 6500, 10, 2));
		mEmployees.Attach(new Employee("Jack", 9600, 12, 3));

		mEmployees.Accept(new CompensationVisitor());

	}
}
