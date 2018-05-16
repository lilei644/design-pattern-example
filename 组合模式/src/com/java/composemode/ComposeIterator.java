package com.java.composemode;

import java.util.Iterator;
import java.util.Stack;

/**
 * 组合模式，组合对象的迭代器，利用栈存放子类的迭代器
 */
public class ComposeIterator implements Iterator {
    private Stack<Iterator> stack = new Stack<Iterator>();

    public ComposeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    // 一个迭代器一个迭代器的遍历，利用递归的方式
    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        Iterator iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent mMenuComponent = (MenuComponent) iterator.next();
            stack.push(mMenuComponent.getIterator());
            return mMenuComponent;
        }
        return null;
    }

    @Override
    public void remove() {

    }

}
