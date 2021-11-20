package com.jiangxia.VisitorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/20/22:32
 * @Description:具体访问者（ConcreteVisitor）：它主要实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElement1 el1) {
        el1.print();
    }

    @Override
    public void visit(ConcreteElement2 el2) {
        el2.print();
    }
}
