package com.jiangxia.VisitorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/20/22:30
 * @Description:抽象访问者（Visitor）这里主要用来定义一个访问具体元素的接口，并且为每个具体元素类对应一个访问操作方法，并且在该操作中的参数类型标识了被访问的具体元素。
 */
public interface Visitor {
    public void visit(ConcreteElement1 el1);
    public void visit(ConcreteElement2 el2);
}
