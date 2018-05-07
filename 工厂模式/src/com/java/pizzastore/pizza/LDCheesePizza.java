package com.java.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("LDCheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
