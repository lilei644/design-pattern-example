package com.java.iteratormode.iterator;

import java.util.ArrayList;

import com.java.iteratormode.MenuItem;

/**
 * 迭代器模式，服务员对象
 */
public class Waitress {
    private ArrayList<Iterator> iterators = new ArrayList<Iterator>();


    public Waitress() {

    }

    public void addIterator(Iterator iterator) {
        iterators.add(iterator);
    }

    /**
     * 只需要遍历迭代器即可遍历添加进来的集合数据
     */
    public void printMenu() {
        Iterator iterator;
        MenuItem menuItem;
        for (int i = 0, len = iterators.size(); i < len; i++) {
            iterator = iterators.get(i);

            while (iterator.hasNext()) {
                menuItem = (MenuItem) iterator.next();
                System.out.println(menuItem.getName() + "***"
                        + menuItem.getPrice() + "***" + menuItem.getDescription());

            }
        }
    }
}
