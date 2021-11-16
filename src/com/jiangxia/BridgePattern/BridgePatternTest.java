package com.jiangxia.BridgePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/16/22:03
 * @Description:
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        RefinedAbstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
        abstraction.otherOperation();
    }
}
