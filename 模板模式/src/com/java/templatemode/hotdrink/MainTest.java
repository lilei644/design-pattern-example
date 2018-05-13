package com.java.templatemode.hotdrink;

/**
 * 模板模式，抽象类制定模板流程，定义抽象方法和具体方法
 */
public class MainTest {

    public static void main(String[] args) {
        HotDrink coffee = new Coffee();
        HotDrink tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();
    }

}
