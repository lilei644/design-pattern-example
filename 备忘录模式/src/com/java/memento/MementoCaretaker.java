package com.java.memento;

import java.util.HashMap;

/**
 * 备忘录模式，开发人员使用的存储方法，用来保存和返回外部开发人员需要缓存的数据
 */
public class MementoCaretaker {
    private HashMap<String, MementoIF> mementomap;

    public MementoCaretaker() {
        mementomap = new HashMap<String, MementoIF>();
    }

    public MementoIF retrieveMemento(String name) {
        return mementomap.get(name);
    }

    /**
     * 备忘录赋值方法
     */
    public void saveMemento(String name, MementoIF memento) {
        this.mementomap.put(name, memento);
    }
}
