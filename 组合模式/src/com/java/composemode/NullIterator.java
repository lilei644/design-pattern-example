package com.java.composemode;

import java.util.Iterator;

/**
 * 空迭代器，数据一致性
 */
public class NullIterator implements Iterator{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
