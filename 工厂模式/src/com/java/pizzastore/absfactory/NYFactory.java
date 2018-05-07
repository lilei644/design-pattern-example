package com.java.pizzastore.absfactory;

import com.java.pizzastore.pizza.NYCheesePizza;
import com.java.pizzastore.pizza.NYPepperPizza;
import com.java.pizzastore.pizza.Pizza;

/**
 * 纽约工厂实现抽象方法
 */
public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
