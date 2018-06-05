package com.java.interpreter.cls;

import java.util.HashMap;

/**
 * 解释器模式，抽象表达式，HashMap存储运算的具体数据
 */
public abstract class AbstractExpresstion {
	public abstract Float interpreter(HashMap<String, Float> var);
}
