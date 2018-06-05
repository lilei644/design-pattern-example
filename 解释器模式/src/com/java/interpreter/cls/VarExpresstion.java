package com.java.interpreter.cls;

import java.util.HashMap;

/**
 * 解释器模式，变量表达式，代表所有操作的数字
 */
public class VarExpresstion extends AbstractExpresstion {
    private String key;

    public VarExpresstion(String _key) {
        this.key = _key;

    }

    @Override
    public Float interpreter(HashMap<String, Float> var) {
        return var.get(this.key);
    }

}
