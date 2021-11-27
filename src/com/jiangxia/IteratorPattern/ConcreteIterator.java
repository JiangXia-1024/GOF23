package com.jiangxia.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {
    public List list = new ArrayList();
    public int index = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(index++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(index==list.size()){
            return false;
        }
        return true;
    }

}
