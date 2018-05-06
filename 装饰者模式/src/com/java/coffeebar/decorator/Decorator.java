package com.java.coffeebar.decorator;

import com.java.coffeebar.Drink;

/**
 * 自定义装饰者，也继承饮料的超类
 */
public class Decorator extends Drink {

    private Drink Obj;

    // 自身引入超类的对象
    public Decorator(Drink Obj) {
        this.Obj = Obj;
    }


    // 利用递归的原理实现循环调用方法
    @Override
    public float cost() {
        return super.getPrice() + Obj.cost();
    }

    @Override
    public String getDescription() {
        return super.description + "-" + super.getPrice() + "&&" + Obj.getDescription();
    }

}
