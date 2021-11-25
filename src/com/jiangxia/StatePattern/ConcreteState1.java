package com.jiangxia.StatePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/25/20:32
 * @Description:具体状态类1
 */
public class ConcreteState1 extends State {
    @Override
    public void Do() {
        System.out.println("吃跑了，来外面散散步");
    }
}
