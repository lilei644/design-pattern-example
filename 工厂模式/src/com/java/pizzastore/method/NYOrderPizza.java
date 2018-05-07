package com.java.pizzastore.method;

import com.java.pizzastore.pizza.NYCheesePizza;
import com.java.pizzastore.pizza.NYPepperPizza;
import com.java.pizzastore.pizza.Pizza;

/**
 * 纽约工厂，继承工厂方法对象
 */
public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
