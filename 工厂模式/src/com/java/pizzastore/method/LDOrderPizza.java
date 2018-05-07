package com.java.pizzastore.method;

import com.java.pizzastore.pizza.LDCheesePizza;
import com.java.pizzastore.pizza.LDPepperPizza;
import com.java.pizzastore.pizza.Pizza;

/**
 * 伦敦工厂，继承工厂方法对象
 */
public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
