package com.java.flyweight;

/**
 * 传统模式，将树定义成单个对象，模拟森林时则直接通过遍历遍历一个个的对象，占用内存较大，耗时较长
 */
public class MainTest {

    public static void main(String[] args) {
        showMemInfo();
        TreesTest mTreesTest;
        mTreesTest = new TreesTest();

        showMemInfo();
        mTreesTest.display();
        showMemInfo();
    }

    public static void showMemInfo() {
        // 最大内存：
        long max = Runtime.getRuntime().maxMemory();
        // 分配内存：
        long total = Runtime.getRuntime().totalMemory();
        // 已分配内存中的剩余空间 ：
        long free = Runtime.getRuntime().freeMemory();
        // 已占用的内存：
        long used = total - free;

        System.out.println("最大内存 = " + max);
        System.out.println("已分配内存 = " + total);
        System.out.println("已分配内存中的剩余空间 = " + free);
        System.out.println("已用内存 = " + used);
        System.out.println("时间 = " + System.currentTimeMillis());
        System.out.println();

    }

}
