package com.java.iteratormode.java;

import java.util.Iterator;

import com.java.iteratormode.MenuItem;

/**
 * 迭代器模式，Java内数组并没有集成迭代器
 */
public class DinerMenu {
	private final static int Max_Items = 5;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[Max_Items];
		addItem("vegetable Blt", "bacon&lettuce&tomato&cabbage", true, 3.58f);
		addItem("Blt", "bacon&lettuce&tomato", false, 3.00f);
		addItem("bean soup", "bean&potato salad", true, 3.28f);
		addItem("hotdog", "onions&cheese&bread", false, 3.05f);

	}

	private void addItem(String name, String description, boolean vegetable,
			float price) {
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		if (numberOfItems >= Max_Items) {
			System.err.println("sorry,menu is full!can not add another item");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}

	}

	public Iterator getIterator() {
		return new DinerIterator();
	}

	/**
	 * 实现Java内部的迭代器，重写迭代方法
	 */
	class DinerIterator implements Iterator {
		private int position = 0;

		@Override
		public boolean hasNext() {
			if (position < numberOfItems) {
				return true;
			}
			position = 0;
			return false;
		}

		@Override
		public Object next() {
			MenuItem menuItem = menuItems[position];
			position++;
			return menuItem;
		}

		@Override
		public void remove() {

		}

	}
}
