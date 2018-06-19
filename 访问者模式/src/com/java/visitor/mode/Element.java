package com.java.visitor.mode;

/**
 * 访问者模式，被访问对象实现的超类，用于注入访问者
 */
public abstract class Element {
	abstract public void Accept(Visitor visitor);
}
