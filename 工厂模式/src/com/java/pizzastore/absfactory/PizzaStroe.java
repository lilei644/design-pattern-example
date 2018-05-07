package com.java.pizzastore.absfactory;


/**
 * 抽象工厂模式，不同的工厂实现不同的生产方法
 * 引用工厂的时候直接引用接口对象
 */
public class PizzaStroe {
	public static void main(String[] args) {

		OrderPizza mOrderPizza;
		mOrderPizza=new	OrderPizza(new LDFactory());
		
	}
}
