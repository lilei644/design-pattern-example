package com.java.visitor;

/**
 * 传统模式，直接通过一个管理类管理所有员工，并实现员工薪资的计算
 * 管理类里面即包含了员工的集合，又包含薪资的计算，若后续拓展新的行为则管理类只会越来越臃肿
 * 应该实现员工的集合管理和计算方法拆分，并且后续新增的每一种行为都是独立开互不影响
 */
public class MainTest {
	public static void main(String[] args) {
		Employees mEmployees = new Employees();

		mEmployees.Attach(new Employee("Tom", 4500, 8, 1));
		mEmployees.Attach(new Employee("Jerry", 6500, 10, 2));
		mEmployees.Attach(new Employee("Jack", 9600, 12, 3));
		mEmployees.getCompensation();
	}

}
