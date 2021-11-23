package com.jiangxia.StrategyPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/23/21:20
 * @Description:测试方法
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        Context context = null;
        System.out.println("策略一");
        context = new Context(new ConcreteStrategy1());
        context.process();

        System.out.println("策略二");
        context = new Context(new ConcreteStrategy2());
        context.process();
    }
}
