package com.java.composemode;

/**
 * 组合模式，类似于数据结构中的树形结构
 * 所有对象为一个统一的节点属性，则需要定一个超类对象，子类均继承此父类，则可循环迭代调用
 */
public class MainTest {
	public static void main(String[] args) {
		Waitress mWaitress = new Waitress();
		CakeHouseMenu mCakeHouseMenu = new CakeHouseMenu();
		DinerMenu mDinerMenu = new DinerMenu();
		mWaitress.addComponent(mCakeHouseMenu);
		mWaitress.addComponent(mDinerMenu);
		mWaitress.printVegetableMenu();
	}
}
