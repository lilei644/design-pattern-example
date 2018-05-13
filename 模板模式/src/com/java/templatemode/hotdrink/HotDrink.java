package com.java.templatemode.hotdrink;

/**
 * 模板模式，制定操作流程，定义抽象方法和具体实现的方法
 */
public abstract class HotDrink {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (addCondimentsHook()) {
            addCondiments();
        }
    }

    /**
     * 煮开水是通用的固定方法
     */
    public final void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 添加原材料是抽象的实现的方法
     */
    public abstract void brew();


    /**
     * 放进杯子里是通用的固定方法
     */
    public final void pourInCup() {
        System.out.println("Pouring into cup");
    }


    /**
     * 添加配料是抽象的需要实现的方法
     */
    public abstract void addCondiments();

    /**
     * 动态变换的条件
     */
    public boolean addCondimentsHook() {
        return true;
    }

}
