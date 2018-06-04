package com.java.flyweight.ms;

/**
 * 蝇量模式，定义新的对象将树对象的各属性内部定义成集合，则调用时只用调用这一个对象即可
 * 占用内存更少，耗时更短
 */
public class MainTest {

    public static void main(String[] args) {

        showMemInfo();

        TreeManager mTreeManager;
        mTreeManager = new TreeManager();

        showMemInfo();
        mTreeManager.displayTrees();
        showMemInfo();

    }

    public static void showMemInfo() {
        // 已分配内存中的剩余空间 ：
        long free = Runtime.getRuntime().freeMemory();
        // 分配内存：
        long total = Runtime.getRuntime().totalMemory();
        // 最大内存：
        long max = Runtime.getRuntime().maxMemory();
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
