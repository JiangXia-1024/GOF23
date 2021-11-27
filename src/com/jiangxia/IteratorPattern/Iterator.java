package com.jiangxia.IteratorPattern;

/**
 * 迭代器接口
 * Iterator是迭代器接口，主要有两个方法：取得迭代对象方法next，判断是否迭代完成方法hasNext
 */
public interface Iterator {
    public Object next();
    public boolean hasNext();
}
