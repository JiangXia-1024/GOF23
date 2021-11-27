package com.jiangxia.IteratorPattern;

/**
 * 抽象容器的接口
 */
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator iterator();
}
