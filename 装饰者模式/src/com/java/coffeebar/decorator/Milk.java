package com.java.coffeebar.decorator;

import com.java.coffeebar.Drink;

public class Milk extends Decorator {

	public Milk(Drink Obj) {		
		super(Obj);
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}

}

