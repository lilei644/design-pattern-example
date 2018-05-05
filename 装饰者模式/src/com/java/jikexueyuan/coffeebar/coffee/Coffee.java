package com.java.jikexueyuan.coffeebar.coffee;

import com.java.jikexueyuan.coffeebar.Drink;


/**
 * 咖啡类型的统一父类
 */
public  class Coffee extends Drink {

	@Override
	public float cost() {
		return super.getPrice();
	}

	
}
