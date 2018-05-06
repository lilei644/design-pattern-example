package com.java.coffeebar.decorator;

import com.java.coffeebar.Drink;

public class Soy extends Decorator {

	public Soy(Drink Obj) {		
		super(Obj);
		super.setDescription("Soy");
		super.setPrice(1.5f);
	}

}

