package com.java.iteratormode;

import java.util.ArrayList;

/**
 * 面向对象模式，服务员对象，负责提供菜单
 */
public class Waitress {
    private CakeHouseMenu mCakeHouseMenu;
    private DinerMenu mDinerMenu;
    private ArrayList<MenuItem> cakeitems;
    private MenuItem[] dineritems;


    public Waitress() {
        mCakeHouseMenu = new CakeHouseMenu();
        cakeitems = mCakeHouseMenu.getMenuItems();

        mDinerMenu = new DinerMenu();
        dineritems = mDinerMenu.getMenuItems();
    }

    /**
     * 传统模式，遍历两个菜单的循环，输出所有的菜单对象
     */
    public void printMenu() {
        MenuItem menuItem;
        for (int i = 0, len = cakeitems.size(); i < len; i++) {
            menuItem = cakeitems.get(i);
            System.out.println(menuItem.getName() + "***"
                    + menuItem.getPrice() + "***" + menuItem.getDescription());

        }
        for (int i = 0, len = mDinerMenu.numberOfItems; i < len; i++) {
            menuItem = dineritems[i];
            System.out.println(menuItem.getName() + "***"
                    + menuItem.getPrice() + "***" + menuItem.getDescription());

        }

    }
}
