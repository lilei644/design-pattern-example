package com.java.pizzastore.simplefactory;


/**
 * 简单工厂模式，将生产方法抽离出单独的类进行生产对象
 */
public class PizzaStroe {
	public static void main(String[] args) {
		SimplePizzaFactory mSimplePizzaFactory;
		OrderPizza mOrderPizza;
		mOrderPizza=new	OrderPizza(new SimplePizzaFactory());
		
	}

	

}
