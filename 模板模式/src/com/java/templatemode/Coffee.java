package com.java.templatemode;

/**
 * 面向对象方法对象，泡咖啡，按固定流程走完
 */
public class Coffee {

    /**
     * 泡咖啡
     */
    public void prepareRecipe() {
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarMilk();
    }


    /**
     * 煮开水
     */
    public void boilWater() {
        System.out.println("Boiling water");
    }


    /**
     * 放咖啡粉
     */
    public void brewCoffee() {
        System.out.println("Brewing coffee");
    }

    /**
     * 放进杯子里
     */
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 添加糖和奶
     */
    public void addSugarMilk() {
        System.out.println("Adding sugar or milk");
    }
}
