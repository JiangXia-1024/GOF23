package com.jiangxia.StrategyPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/23/21:17
 * @Description:具体策略类1
 */
public class ConcreteStrategy1 extends Strategy {
    @Override
    public void run() {
        System.out.println("具体策略类ConcreteStrategy1跑着走");
    }
}
