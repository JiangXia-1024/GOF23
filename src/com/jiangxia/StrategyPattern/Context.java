package com.jiangxia.StrategyPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/23/21:18
 * @Description:上下文类
 */
public class Context {
    public Strategy strategy;

    //构造函数
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void process(){
        strategy.run();
    }
}
