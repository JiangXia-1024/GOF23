package com.jiangxia.VisitorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/20/22:30
 * @Description:抽象元素（Element）：这里声明一个包含接受操作的接口，被接受的访问者对象作为 接受法的参数。
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
    public abstract void print();
}
