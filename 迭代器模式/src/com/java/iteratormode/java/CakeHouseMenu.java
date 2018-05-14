package com.java.iteratormode.java;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.iteratormode.MenuItem;

/**
 * 迭代器模式，ArrayList 集成了Java内部的迭代器，可直接使用
 */
public class CakeHouseMenu {
	private ArrayList<MenuItem> menuItems;
	private int position=0;
	public CakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("KFC Cake Breakfast","boiled eggs&toast&cabbage",true,3.99f);
		addItem("MDL Cake Breakfast","fried eggs&toast",false,3.59f);
		addItem("Stawberry Cake","fresh stawberry",true,3.29f);
		addItem("Regular Cake Breakfast","toast&sausage",true,2.59f);
	}

	private void addItem(String name, String description, boolean vegetable,
			float price) {
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		menuItems.add(menuItem);
	}
	

	
	public Iterator getIterator()
	{
		return menuItems.iterator();
	}
	//其他功能代码

	
}
