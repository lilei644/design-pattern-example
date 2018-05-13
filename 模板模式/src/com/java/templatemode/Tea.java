package com.java.templatemode;

/**
 * 面向对象，泡茶，按固定流程走完
 */
public class Tea {


    /**
     * 泡茶
     */
    public void prepareRecipe() {
        boilWater();
        brewTea();
        pourInCup();
        addLemon();
    }


    /**
     * 煮开水
     */
    public void boilWater() {
        System.out.println("Boiling water");
    }


    /**
     * 放茶叶
     */
    public void brewTea() {
        System.out.println("Brewing tea");
    }

    /**
     * 放进杯子里
     */
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 添加柠檬
     */
    public void addLemon() {
        System.out.println("Adding lemon");
    }


}
