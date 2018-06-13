package com.java.memento;

import java.util.ArrayList;

/**
 * 备忘录模式，第一个开发者，使用ArrayList缓存数据，通过Memento类实现接口MementoIF统一封装
 */
public class Originator2 {
	private ArrayList<String> state;

	public Originator2() {
		state = new ArrayList<String>();
	}

	public MementoIF createMemento() {
		return new Memento(state);
	}

	public void restoreMemento(MementoIF memento) {
		state = ((Memento) memento).getState();
	}

	public void testState1() {
		state = new ArrayList<String>();
		state.add("blood:320");
		state.add("progress:gate2 mid");
		state.add("enemy:15");

	}

	public void testState2() {
		state = new ArrayList<String>();
		state.add("blood:230");
		state.add("progress:gate8 last");
		state.add("enemy:12");

	}

	public void showState() {
		System.out.println("now state:" + state.toString());
	}

	private class Memento implements MementoIF {

		private ArrayList<String> state;

		private Memento(ArrayList<String> state) {
			this.state = new ArrayList(state);
		}

		private ArrayList<String> getState() {
			return state;
		}

		private void setState(ArrayList<String> state) {
			this.state = state;
		}
	}

}
