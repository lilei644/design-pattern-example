package com.java.coffeebar;

/**
 * 饮料的超类，封装基本方法和定义抽象方法
 */
public abstract class Drink {

	public String description="";
	private float price=0f;
	
	
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	public String getDescription()
	{
		return description+"-"+this.getPrice();
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public abstract float cost();
	
}
