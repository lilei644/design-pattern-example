package com.java.singleton;

public class Test {


	/**
	 * 传统模式，一个对象可以创建多个实例
	 */
	Test() {
		Abc n1,n2;
		n1=new Abc();
		n2=new Abc();
	}

	
	public class Abc
	{
		public Abc() {

		}
	}

	public static void main(String[] args) {

		// 传统模式，一个对象new一次实例
		Test test1 = new Test();
		Test test2 = new Test();

		// 单例模式
		ChocolateFactory.getInstance().drain();
		ChocolateFactory.getInstance().boil();
		ChocolateFactory.getInstance().fill();

	}

}
