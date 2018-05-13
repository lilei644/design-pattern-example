package com.java.templatemode.hotdrink;

/**
 * 模板模式，泡茶对象，集成父类的必须方法，自定义实现具体方法
 */
public class Tea extends HotDrink {

    @Override
    public void brew() {
        System.out.println("Brewing tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    /**
     * 自定义的条件，是否需要添加辅料
     * @return boolean
     */
    @Override
    public boolean addCondimentsHook() {
        return false;
    }
}
