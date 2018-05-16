package com.java.composemode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合模式，list集合里面添加的是超类的菜单
 */
public class Waitress {
    private ArrayList<MenuComponent> iterators = new ArrayList<MenuComponent>();

    public Waitress() {

    }

    public void addComponent(MenuComponent mMenuComponent) {
        iterators.add(mMenuComponent);

    }

    // 输出所有的菜单
    public void printMenu() {
        Iterator iterator;
        MenuComponent menuItem;
        for (int i = 0, len = iterators.size(); i < len; i++) {
            iterators.get(i).print();
            iterator = iterators.get(i).getIterator();

            while (iterator.hasNext()) {
                menuItem = (MenuComponent) iterator.next();
                menuItem.print();
            }

        }

    }

    // 输出所有的素食菜单
    public void printVegetableMenu() {

        Iterator iterator;
        MenuComponent menuItem;
        for (int i = 0, len = iterators.size(); i < len; i++) {
            iterators.get(i).print();
            iterator = iterators.get(i).getIterator();

            while (iterator.hasNext()) {
                menuItem = (MenuComponent) iterator.next();
                if (menuItem.isVegetable()) {
                    menuItem.print();
                }
            }

        }

    }
}
