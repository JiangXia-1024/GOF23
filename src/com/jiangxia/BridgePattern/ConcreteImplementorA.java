package com.jiangxia.BridgePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/16/21:58
 * @Description:
 */
public class ConcreteImplementorA implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("具体实现ConcreteImplementorA");
    }
}
