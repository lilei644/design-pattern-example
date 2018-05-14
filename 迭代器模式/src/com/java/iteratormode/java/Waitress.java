package com.java.iteratormode.java;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.iteratormode.MenuItem;

/**
 * 迭代器模式，使用Java内部自带的迭代器
 */
public class Waitress {
	private ArrayList<Iterator> iterators=new ArrayList<Iterator>();


	public Waitress() {
		
	}
	public void addIterator(Iterator iterator)
	{
		iterators.add(iterator);
		
	}
	public void printMenu() {
		Iterator iterator;
		MenuItem menuItem;
		for (int i = 0, len = iterators.size(); i < len; i++) {
			iterator = iterators.get(i);
			
			while(iterator.hasNext())
			{
				menuItem=(MenuItem)	iterator.next();
				System.out.println(menuItem.getName() + "***"
						+menuItem.getPrice()+"***"+ menuItem.getDescription());

			}
			
			
		}
	}
}
