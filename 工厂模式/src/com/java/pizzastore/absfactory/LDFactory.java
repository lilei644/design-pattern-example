package com.java.pizzastore.absfactory;

import com.java.pizzastore.pizza.LDCheesePizza;
import com.java.pizzastore.pizza.LDPepperPizza;
import com.java.pizzastore.pizza.Pizza;

/**
 * 伦敦工厂实现抽象方法
 */
public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
