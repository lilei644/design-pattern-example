package com.java.pizzastore.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.java.pizzastore.pizza.Pizza;

/**
 * 工厂方法对象，给不同的工厂继承
 */
public abstract class OrderPizza {

	public OrderPizza() {
		Pizza pizza = null;
		String ordertype;

		do {
			ordertype = gettype();
			pizza = createPizza(ordertype);

			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}

	abstract Pizza createPizza(String ordertype);

	private String gettype() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();

			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
