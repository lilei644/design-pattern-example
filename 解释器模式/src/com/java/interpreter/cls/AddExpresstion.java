package com.java.interpreter.cls;

import java.util.HashMap;

/**
 * 解释器模式，相加的表达式
 */
public class AddExpresstion extends SymbolExpresstion {

    public AddExpresstion(AbstractExpresstion _left, AbstractExpresstion _right) {
        super(_left, _right);
    }

    @Override
    public Float interpreter(HashMap<String, Float> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }

}
