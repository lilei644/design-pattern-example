package com.java.iteratormode.iterator;

import com.java.iteratormode.MenuItem;

/**
 * 自定义迭代器，中餐厅对象，返回实现的迭代器对象即可遍历集合
 */
public class DinerMenu {
    private final static int Max_Items = 5;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[Max_Items];
        addItem("vegetable Blt", "bacon&lettuce&tomato&cabbage", true, 3.58f);
        addItem("Blt", "bacon&lettuce&tomato", false, 3.00f);
        addItem("bean soup", "bean&potato salad", true, 3.28f);
        addItem("hotdog", "onions&cheese&bread", false, 3.05f);

    }

    private void addItem(String name, String description, boolean vegetable,
                         float price) {
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        if (numberOfItems >= Max_Items) {
            System.err.println("sorry,menu is full!can not add another item");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }

    }

    public Iterator getIterator() {
        return new DinerIterator();
    }

    /**
     * 自定义迭代器对象，实现遍历数组的方法
     */
    class DinerIterator implements Iterator {
        private int position;

        public DinerIterator() {
            position = 0;
        }

        @Override
        public boolean hasNext() {
            if (position < numberOfItems) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            MenuItem menuItem = menuItems[position];
            position++;
            return menuItem;
        }
    }
}
