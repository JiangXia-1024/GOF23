package com.jiangxia.VisitorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/20/22:31
 * @Description:
 */
public class ConcreteElement1 extends Element{
    public void print(){
        System.out.println("这是具体元素ConcreteElement1");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
