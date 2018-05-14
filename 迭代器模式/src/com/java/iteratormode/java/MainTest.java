package com.java.iteratormode.java;


/**
 * 迭代器模式，使用Java内部自带的迭代器
 * 并新增一种类型的菜单也可直接添加
 */
public class MainTest {
	public static void main(String[] args) {
		Waitress mWaitress=new Waitress();
		CakeHouseMenu mCakeHouseMenu = new CakeHouseMenu();
		DinerMenu	mDinerMenu = new DinerMenu();
		CafeMenu mCafeMenu=new CafeMenu();
		
		mWaitress.addIterator(mCakeHouseMenu.getIterator());
		mWaitress.addIterator(mDinerMenu.getIterator());

		// 新增咖啡菜单
		mWaitress.addIterator(mCafeMenu.getIterator());
		mWaitress.printMenu();
	}
}
