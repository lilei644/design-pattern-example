package com.java.templatemode;

/**
 * 面向对象模式，调用对象内提供的方法
 */
public class MainTest {


    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();
    }

}
