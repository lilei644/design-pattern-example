package com.java.visitor.mode;

/**
 * 访问者模式，访问者接口对象
 */
public interface Visitor {
	abstract public void Visit(Element element);
	
}
