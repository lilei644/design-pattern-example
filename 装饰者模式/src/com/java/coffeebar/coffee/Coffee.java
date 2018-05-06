package com.java.coffeebar.coffee;

import com.java.coffeebar.Drink;


/**
 * 咖啡类型的统一父类
 */
public  class Coffee extends Drink {

	@Override
	public float cost() {
		return super.getPrice();
	}

	
}
