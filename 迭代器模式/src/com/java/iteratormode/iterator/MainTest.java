package com.java.iteratormode.iterator;


/**
 * 迭代器模式，自定义迭代器接口
 * 实现迭代器的遍历方法后即可将不同类型的集合数据统一遍历输出
 */
public class MainTest {
	public static void main(String[] args) {
		Waitress mWaitress=new Waitress();
		CakeHouseMenu mCakeHouseMenu = new CakeHouseMenu();
		DinerMenu	mDinerMenu = new DinerMenu();

		// 添加集合对象到迭代器的集合中
		mWaitress.addIterator(mCakeHouseMenu.getIterator());
		mWaitress.addIterator(mDinerMenu.getIterator());
		mWaitress.printMenu();
	}
}
