package com.java.memento;

/**
 * 备忘录模式：在不破坏封装的前提下，存储关键对象的重要状态，从而可以在将来把对象还原到存储的那个状态
 */
public class MainTest {

	public static void main(String[] args) {
		MementoCaretaker mMementoCaretaker = new MementoCaretaker();
		Originator mOriginator = new Originator();
		Originator2 mOriginator2 = new Originator2();

		System.out.println("*****Originator*****");
		mOriginator.testState1();

		// 保存第一个人的数据
		mMementoCaretaker.saveMemento("Originator", mOriginator.createMemento());
		mOriginator.showState();
		mOriginator.testState2();
		mOriginator.showState();

		// 恢复数据
		mOriginator.restoreMemento(mMementoCaretaker.retrieveMemento("Originator"));
		mOriginator.showState();

		System.out.println("*****Originator 2*****");
		mOriginator2.testState1();
		mOriginator2.showState();

		// 保存第二个人的进度
		mMementoCaretaker.saveMemento("Originator2", mOriginator2.createMemento());
		mOriginator2.testState2();
		mOriginator2.showState();

		// 回复数据
		mOriginator2.restoreMemento(mMementoCaretaker.retrieveMemento("Originator2"));
		mOriginator2.showState();

		//System.out.println("*****Originator&&Originator 2*****");
	//	 mOriginator.restoreMemento(mMementoCaretaker
	//	 .retrieveMemento("Originator2"));
	//	 mOriginator.showState();

	}

}
