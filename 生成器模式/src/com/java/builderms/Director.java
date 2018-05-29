package com.java.builderms;

import com.java.builderms.builder.AbsBuilder;

/**
 * 生成器模式，引导者对象
 */
public class Director {
    private AbsBuilder builder;

    public Director(AbsBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(AbsBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildvacation();
        builder.getVacation().showInfo();
    }
}
