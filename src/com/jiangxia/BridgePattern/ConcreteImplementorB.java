package com.jiangxia.BridgePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/16/21:59
 * @Description:
 */
public class ConcreteImplementorB implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("具体实现ConcreteImplementorB");
    }
}
