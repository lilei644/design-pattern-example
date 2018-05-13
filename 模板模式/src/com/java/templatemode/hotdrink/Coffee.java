package com.java.templatemode.hotdrink;

/**
 * 模板模式，咖啡对象，集成模板方法，实现具体方法
 */
public class Coffee extends HotDrink {

    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar or milk");
    }

}
