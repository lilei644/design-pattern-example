package com.java.composemode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合模式，新增的甜品菜单对象，中餐厅菜单下的子类菜单
 */
public class SubMenu extends MenuComponent {
    private ArrayList<MenuComponent> menuItems;

    public SubMenu() {
        menuItems = new ArrayList<MenuComponent>();

        addItem("Apple Cookie", "Apple&candy&Cookie", true, 1.99f);
        addItem("Banana Cookie", "Banana&candy&Cookie", false, 1.59f);
        addItem("Orange Cookie", "Orange&Cookie", true, 1.29f);
    }

    private void addItem(String name, String description, boolean vegetable,
                         float price) {
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }

    public Iterator getIterator() {
        return new ComposeIterator(menuItems.iterator());
    }

    @Override
    public void print() {
        System.out.println("****This is SubMenu****");
    }

    // 其他功能代码

}
