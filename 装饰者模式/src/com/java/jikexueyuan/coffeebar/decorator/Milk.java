package com.java.jikexueyuan.coffeebar.decorator;

import com.java.jikexueyuan.coffeebar.Drink;

public class Milk extends Decorator {

	public Milk(Drink Obj) {		
		super(Obj);
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}

}

