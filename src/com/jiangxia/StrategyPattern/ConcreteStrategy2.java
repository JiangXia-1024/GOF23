package com.jiangxia.StrategyPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/23/21:17
 * @Description:具体策略类2
 */
public class ConcreteStrategy2 extends Strategy {
    @Override
    public void run() {
        System.out.println("具体策略类ConcreteStrategy2慢悠悠地走");
    }
}
