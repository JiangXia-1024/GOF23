package com.jiangxia.BridgePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/16/21:53
 * @Description:抽象角色
 */
public abstract class Abstraction {
    // 持有一个 Implementor 对象，形成聚合关系
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    // 可能需要转调实现部分的具体实现
    public void operation() {
        implementor.operationImpl();
    }
}

