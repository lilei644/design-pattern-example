package com.java.visitor.mode;

import java.util.HashMap;

/**
 * 访问者模式，员工管理类，只需管理所有员工的集合对象，若外部需要获取员工信息，则只需通过访问方法获取员工信息进行自定义操作
 */
public class Employees {
	private HashMap<String, Employee> employees;

	public Employees() {
		employees = new HashMap();
	}

	public void Attach(Employee employee) {
		employees.put(employee.getName(), employee);
	}

	public void Detach(Employee employee) {
		employees.remove(employee);
	}

	public Employee getEmployee(String name) {
		return employees.get(name);
	}

	public void Accept(Visitor visitor) {
		for (Employee e : employees.values()) {
			e.Accept(visitor);
		}
	}
}
