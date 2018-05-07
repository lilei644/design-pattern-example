package com.java.pizzastore.pizza;

/**
 * 披萨抽象对象，实现公共方法，抽象差异化的方法
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setname(String name) {
        this.name = name;
    }
}
