package com.java.pizzastore.simplefactory;

import com.java.pizzastore.pizza.CheesePizza;
import com.java.pizzastore.pizza.GreekPizza;
import com.java.pizzastore.pizza.PepperPizza;
import com.java.pizzastore.pizza.Pizza;

/**
 * 简单工厂模式，将生产方法抽离出单独的类进行生产
 */
public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
