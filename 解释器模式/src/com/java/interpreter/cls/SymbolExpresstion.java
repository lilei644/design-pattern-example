package com.java.interpreter.cls;

/**
 * 解释器模式，运算符相关的表达式，每种运算符操作都是两个数据
 */
public abstract class SymbolExpresstion extends AbstractExpresstion {
    protected AbstractExpresstion left;
    protected AbstractExpresstion right;

    public SymbolExpresstion(AbstractExpresstion _left,
                             AbstractExpresstion _right) {
        this.left = _left;

        this.right = _right;
    }

}
