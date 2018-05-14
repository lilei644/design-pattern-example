package com.java.iteratormode.iterator;

import java.util.ArrayList;

import com.java.iteratormode.MenuItem;

/**
 * 自定义迭代器，西餐厅对象，返回实现的迭代器对象即可遍历集合
 */
public class CakeHouseMenu {
    private ArrayList<MenuItem> menuItems;


    public CakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("KFC Cake Breakfast", "boiled eggs&toast&cabbage", true, 3.99f);
        addItem("MDL Cake Breakfast", "fried eggs&toast", false, 3.59f);
        addItem("Stawberry Cake", "fresh stawberry", true, 3.29f);
        addItem("Regular Cake Breakfast", "toast&sausage", true, 2.59f);
    }

    private void addItem(String name, String description, boolean vegetable,
                         float price) {
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }


    public Iterator getIterator() {
        return new CakeHouseIterator();
    }

    /**
     * 自定义迭代器对象，西餐厅实现迭代方法
     */
    class CakeHouseIterator implements Iterator {
        private int position = 0;

        public CakeHouseIterator() {
            position = 0;
        }

        @Override
        public boolean hasNext() {
            if (position < menuItems.size()) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            MenuItem menuItem = menuItems.get(position);
            position++;
            return menuItem;
        }
    }

}
