package com.java.flyweight;

/**
 * 传统模式，树的对象，包含树的x,y坐标和年龄
 */
public class Tree {
    private int xCoord, yCoord, age;

    public Tree(int xCoord, int yCoord, int age) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.age = age;
    }

    public void display() {
        // System.out.print("x");
    }
}
