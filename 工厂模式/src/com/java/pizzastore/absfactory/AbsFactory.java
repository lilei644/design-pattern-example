package com.java.pizzastore.absfactory;

import com.java.pizzastore.pizza.Pizza;

/**
 * 工厂方法的抽象接口
 */
public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
