package com.java.coffeebar.decorator;

import com.java.coffeebar.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink Obj) {		
		super(Obj);
		super.setDescription("Chocolate");
		super.setPrice(3.0f);
	}

}
