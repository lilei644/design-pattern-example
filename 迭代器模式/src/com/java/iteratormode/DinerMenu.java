package com.java.iteratormode;

/**
 * 面向对象模式，中餐厅对象，直接返回菜单的数组对象
 */
public class DinerMenu {
	private final static int Max_Items=5;
	public int numberOfItems=0;
	private MenuItem[] menuItems;
	
	public DinerMenu()
	{
		menuItems=new MenuItem[Max_Items] ;
		addItem("vegetable Blt","bacon&lettuce&tomato&cabbage",true,3.58f);
		addItem("Blt","bacon&lettuce&tomato",false,3.00f);
		addItem("bean soup","bean&potato salad",true,3.28f);
		addItem("hotdog","onions&cheese&bread",false,3.05f);
		
		
	}
	private void addItem(String name, String description, boolean vegetable,
			float price) {
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		if(numberOfItems>=Max_Items)
		{
			System.err.println("sorry,menu is full!can not add another item");
		}else{
			menuItems[numberOfItems]=menuItem;
			numberOfItems++;
		}
		
	}
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
}
