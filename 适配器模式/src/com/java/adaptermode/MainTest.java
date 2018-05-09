package com.java.adaptermode;

import com.java.adaptermode.adapter.TurkeyAdapter2;
import com.java.adaptermode.duck.Duck;
import com.java.adaptermode.duck.GreenHeadDuck;
import com.java.adaptermode.turkey.WildTurkey;


/**
 * 适配器模式，一个对象适配成为另外一个对象，并实现其原有定义的方法
 */
public class MainTest {
	public static void main(String[] args) {
		GreenHeadDuck duck=new GreenHeadDuck();
		
		WildTurkey turkey=new WildTurkey();
		
		Duck duck2turkeyAdapter=new TurkeyAdapter2();
		turkey.gobble();
		turkey.fly();
		duck.quack();
		duck.fly();

		// 通过适配器转换后的火鸡变成了一直鸭子
		duck2turkeyAdapter.quack();
		duck2turkeyAdapter.fly();
	}
}
