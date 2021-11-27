package com.jiangxia.IteratorPattern;

public class IteratorPatternTest {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("刘备");
        aggregate.add("关羽");
        aggregate.add("张飞");
        Iterator it = aggregate.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}
